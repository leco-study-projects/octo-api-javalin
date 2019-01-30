package co.l3co.bootstrap

import co.l3co.dao.contracts.EventDAO
import co.l3co.dao.contracts.IssueDAO
import co.l3co.dao.contracts.UserDAO
import co.l3co.domain.Event
import co.l3co.domain.Issue
import co.l3co.domain.User
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class LoadEvent : KoinComponent {

    val eventDAO by inject<EventDAO>()
    val issueDAO by inject<IssueDAO>()
    val userDAO by inject<UserDAO>()

    fun load() {
        val event = Event(null, null, "edited")
        val eventSaved = eventDAO.save(event)

        val issue = Issue(number = 1, comments = 1, title = "First Commit", state = "open", event = eventSaved)
        val issueSaved = issueDAO.save(issue)

        val user = User(issue = issueSaved, login = "leco")
        userDAO.save(user)
    }
}

