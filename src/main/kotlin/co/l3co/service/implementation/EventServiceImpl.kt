package co.l3co.service.implementation

import co.l3co.dao.contracts.EventDAO
import co.l3co.service.contracts.EventService
import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.resources.response.EventResponse


class EventServiceImpl(private val eventDAO: EventDAO) : EventService {
    override fun findByAction(action: String): List<EventResponse> {
        return eventDAO.findByAction(action).map { event -> event.convertToResponse() }
    }

    override fun save(eventRequest: EventRequest) {
        val event = eventRequest.convertToDomain()
        event.issue!!.event = event
        event.issue!!.user!!.issue = event.issue
        eventDAO.save(event)
    }
}