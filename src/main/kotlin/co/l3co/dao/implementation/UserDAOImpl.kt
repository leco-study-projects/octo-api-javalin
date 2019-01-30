package co.l3co.dao.implementation

import co.l3co.configuration.HibernateConfiguration
import co.l3co.dao.contracts.UserDAO
import co.l3co.domain.User
import java.util.*

class UserDAOImpl(val hibernate: HibernateConfiguration) : UserDAO {
    override fun save(s: User): User {
        val session = hibernate.buildSessionFactory()!!.openSession()
        val transaction = session.beginTransaction()
        val saved = session.save(s) as UUID
        transaction.commit()
        session.close()
        return findById(saved)
    }

    override fun findById(id: UUID): User {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from User where id=:id")
        query.setParameter("id", id)
        return query.uniqueResult() as User
    }

    override fun deleteById(id: UUID) {
        val event = findById(id)
        val session = hibernate.buildSessionFactory()!!.openSession()
        val transaction = session.beginTransaction()
        session.delete(event)
        transaction.commit()
        session.close()
    }

    override fun findAll(): List<User> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from User")
        return query.resultList as List<User>
    }

    override fun findByLogin(login: String): List<User> {
        val query = hibernate.buildSessionFactory()!!
            .openSession().createQuery("from User where login=:login")
        query.setParameter("login", login)
        return query.resultList as List<User>
    }
}