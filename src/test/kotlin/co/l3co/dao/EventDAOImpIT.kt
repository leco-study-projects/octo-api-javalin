package co.l3co.dao

import co.l3co.TestBase
import co.l3co.dao.contracts.EventDAO
import co.l3co.domain.Event
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test
import org.koin.standalone.inject
import org.koin.test.KoinTest

class EventDAOImpIT : TestBase() {

    private val eventDAO by inject<EventDAO>()

    @Test
    fun findByAction() {
        val eventEdited = Event(null, null, "edited")
        val eventCreate = Event(null, null, "create")

        eventDAO.save(eventEdited)
        eventDAO.save(eventCreate)

        assertTrue(eventDAO.findByAction("edited").isNotEmpty())
    }

    @Test
    fun findById() {
        val eventCreate = Event(null, null, "create")

        val saved = eventDAO.save(eventCreate)
        assertNotNull(eventDAO.findById(saved!!.id!!))
    }

    @Test
    fun deleteById() {
        val eventCreate = Event(null, null, "create")

        val saved = eventDAO.save(eventCreate)
        assertNotNull(eventDAO.findById(saved!!.id!!))

        eventDAO.deleteById(saved.id!!)

        assertNull(eventDAO.findById(saved.id!!))
    }

    @Test
    fun findAll() {
        eventDAO.save(Event(null, null, "edited"))
        eventDAO.save(Event(null, null, "edited"))
        eventDAO.save(Event(null, null, "edited"))

        assertTrue(eventDAO.findAll().size >= 3)
    }
}