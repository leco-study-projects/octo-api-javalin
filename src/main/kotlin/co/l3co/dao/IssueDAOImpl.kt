package co.l3co.dao.implementation

import co.l3co.configuration.HibernateConfiguration
import co.l3co.dao.contracts.IssueDAO
import co.l3co.domain.Event
import co.l3co.domain.Issue
import java.util.*

class IssueDAOImpl(val hibernate: HibernateConfiguration) : IssueDAO {
    override fun save(s: Issue): Issue? {
        val session = hibernate.buildSessionFactory()!!.openSession()
        val transaction = session.beginTransaction()
        val saved = session.save(s) as UUID
        transaction.commit()
        session.close()
        return findById(saved)
    }

    override fun findById(id: UUID): Issue? {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Issue where id=:id")
        query.setParameter("id", id)

        query.setParameter("id", id)
        val result = query.uniqueResult()
        return if (result != null) result as Issue else null
    }

    override fun deleteById(id: UUID) {
        val event = findById(id)
        val session = hibernate.buildSessionFactory()!!.openSession()
        val transaction = session.beginTransaction()
        session.delete(event)
        transaction.commit()
        session.close()
    }

    override fun findAll(): List<Issue> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Issue")
        return query.resultList as List<Issue>
    }

    override fun findByState(state: String): List<Issue> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Issue where state=:state")
        query.setParameter("state", state)
        return query.resultList as List<Issue>

    }

    override fun findByNumber(number: Int): List<Issue> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Issue where number=:number")
        query.setParameter("number", number)
        return query.resultList as List<Issue>
    }
}