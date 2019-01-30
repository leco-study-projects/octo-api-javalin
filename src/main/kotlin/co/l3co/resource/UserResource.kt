package co.l3co.resource

import co.l3co.service.contracts.UserService
import io.javalin.Context

class UserResource(private val userService: UserService) {

    fun get(ctx: Context) {
        ctx.json(userService.findByLogin(ctx.pathParam("login")))
    }
}