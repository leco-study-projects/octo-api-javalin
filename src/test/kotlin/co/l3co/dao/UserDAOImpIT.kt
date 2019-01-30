package co.l3co.dao

import co.l3co.TestBase
import co.l3co.dao.contracts.UserDAO
import co.l3co.domain.Event
import co.l3co.domain.User
import junit.framework.Assert.*
import org.junit.Test
import org.koin.standalone.inject

class UserDAOImpIT : TestBase() {

    private val userDAO by inject<UserDAO>()

    @Test
    fun findById() {
        val saved = userDAO.save(User(login = "leco"))
        assertNotNull(userDAO.findById(saved!!.id!!))
    }

    @Test
    fun deleteById() {
        val eventCreate = Event(null, null, "create")

        val saved = userDAO.save(User(login = "leco"))
        assertNotNull(userDAO.findById(saved!!.id!!))

        userDAO.deleteById(saved.id!!)

        assertNull(userDAO.findById(saved.id!!))
    }

    @Test
    fun findAll() {
        userDAO.save(User(login = "leco"))
        userDAO.save(User(login = "zety"))
        userDAO.save(User(login = "bill"))

        assertTrue(userDAO.findAll().size >= 3)
    }

    @Test
    fun findByLogin() {
        userDAO.save(User(login = "leco"))
        userDAO.save(User(login = "zety"))
        userDAO.save(User(login = "bill"))

        assertTrue(userDAO.findByLogin("zety").isNotEmpty())
    }
}