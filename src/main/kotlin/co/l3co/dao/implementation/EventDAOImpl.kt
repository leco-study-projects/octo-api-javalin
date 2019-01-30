package co.l3co.dao.implementation

import co.l3co.configuration.HibernateConfiguration
import co.l3co.dao.contracts.EventDAO
import co.l3co.domain.Event
import java.util.*

class EventDAOImpl(val hibernate: HibernateConfiguration) : EventDAO {

    override fun findByAction(action: String): List<Event> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Event where action=:action")
        query.setParameter("action", action)
        return query.resultList as List<Event>
    }

    override fun save(s: Event): Event {
        val session = hibernate.buildSessionFactory()!!.openSession()
        val transaction = session.beginTransaction()
        val saved = session.save(s) as UUID
        transaction.commit()
        session.close()
        return findById(saved)
    }

    override fun findById(id: UUID): Event {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Event where id=:id")
        query.setParameter("id", id)
        return query.uniqueResult() as Event
    }

    override fun deleteById(id: UUID) {
        val event = findById(id)
        val session = hibernate.buildSessionFactory()!!.openSession()
        val transaction = session.beginTransaction()
        session.delete(event)
        transaction.commit()
        session.close()
    }

    override fun findAll(): List<Event> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from Event")
        return query.resultList as List<Event>
    }
}