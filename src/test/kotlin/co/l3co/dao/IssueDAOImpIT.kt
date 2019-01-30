package co.l3co.dao

import co.l3co.TestBase
import co.l3co.dao.contracts.EventDAO
import co.l3co.dao.contracts.IssueDAO
import co.l3co.domain.Event
import co.l3co.domain.Issue
import junit.framework.Assert.*
import org.junit.Before
import org.junit.Test
import org.koin.standalone.inject
import org.koin.test.KoinTest

class IssueDAOImpIT : TestBase() {

    private val issueDAO by inject<IssueDAO>()

    @Test
    fun findByNumber() {
        val issue = Issue(number = 1, comments = 1, title = "First Commit", state = "open")
        issueDAO.save(issue)

        assertTrue(issueDAO.findByNumber(1).isNotEmpty())
    }

    @Test
    fun findByNumberNotFound() {
        val issue = Issue(number = 1, comments = 1, title = "First Commit", state = "open")
        issueDAO.save(issue)

        assertTrue(issueDAO.findByNumber(999).isEmpty())
    }

    @Test
    fun findByState() {
        val issue = Issue(number = 1, comments = 1, title = "First Commit", state = "open")
        issueDAO.save(issue)

        assertTrue(issueDAO.findByState("open").isNotEmpty())
    }

    @Test
    fun findByStateInvalid() {
        issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "open"))
        issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "close"))

        assertTrue(issueDAO.findByState("checked").isEmpty())
    }

    @Test
    fun findById() {
        val saved = issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "open"))

        assertNotNull(issueDAO.findById(saved!!.id!!))
    }

    @Test
    fun deleteById() {
        val saved = issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "open"))
        assertNotNull(issueDAO.findById(saved!!.id!!))

        issueDAO.deleteById(saved.id!!)

        assertNull(issueDAO.findById(saved.id!!))
    }

    @Test
    fun findAll() {
        issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "open"))
        issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "open"))
        issueDAO.save(Issue(number = 1, comments = 1, title = "First Commit", state = "open"))

        assertTrue(issueDAO.findAll().size >= 3)
    }
}