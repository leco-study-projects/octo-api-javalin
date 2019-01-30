package co.l3co.service.contracts

import com.leco.kotlinocto.resources.response.EventResponse
import com.sun.jdi.request.EventRequest

interface EventService {

    fun findByAction(action: String): List<EventResponse>

    fun save(eventRequest: EventRequest)
}
