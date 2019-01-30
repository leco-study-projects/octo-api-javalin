package co.l3co.resource

import co.l3co.service.contracts.EventService
import com.sun.jdi.request.EventRequest
import io.javalin.Context

class EventResource(private val eventService: EventService) {

    fun post(ctx: Context) {
        eventService.save(ctx.body<EventRequest>())
        ctx.status(201)
    }

    fun get(ctx: Context) {
        ctx.json(eventService.findByAction(ctx.pathParam("action")))
    }
}