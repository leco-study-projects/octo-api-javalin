package co.l3co.service.contracts

import com.leco.kotlinocto.resources.request.EventRequest
import com.leco.kotlinocto.resources.response.EventResponse


interface EventService {

    fun findByAction(action: String): List<EventResponse>

    fun save(eventRequest: EventRequest)
}
