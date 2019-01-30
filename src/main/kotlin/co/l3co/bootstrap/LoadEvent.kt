package co.l3co.bootstrap

import co.l3co.domain.Event
import co.l3co.domain.Issue
import co.l3co.domain.User
import co.l3co.configuration.buildSessionFactory as sessionFactory

fun buildEvent(): Event {
    var event = Event()
    event.action = "edited"

    var issue = Issue()
    issue.authorAssociation = "l3co"
    issue.comments = 1
    issue.title = "test create issue"
    issue.number = 1
    issue.state = "open"

    var user = User()
    user.login = "l3co"

    user.issue = issue

    issue.event = event
    issue.user = user

    event.issue = issue

    return event
}

fun load() {

    val session = sessionFactory()!!.openSession()
    val transaction = session.beginTransaction()
    session.save(buildEvent())
    transaction.commit()
    session.close()
}