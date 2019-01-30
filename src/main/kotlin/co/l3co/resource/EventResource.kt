package co.l3co.resource

import co.l3co.service.contracts.EventService
import com.leco.kotlinocto.resources.request.EventRequest
import io.javalin.Context

class EventResource(private val eventService: EventService) {

    fun post(ctx: Context) {
//        println(ctx.body())
        val event = ctx.body<EventRequest>()
        println(event)
        eventService.save(event)
        ctx.status(201)
    }

    fun get(ctx: Context) {
        ctx.json(eventService.findByAction(ctx.pathParam("action")))
    }
}