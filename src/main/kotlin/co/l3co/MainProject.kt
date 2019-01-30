package co.l3co

import io.javalin.Javalin

val port: String = System.getenv("APPLICATION_PORT") ?: "7000"

fun main() {
    val app = Javalin.create().start(port.toInt())
    app.routes {
        app.get("/") { ctx -> ctx.result("{\"message\": \"ok\"}") }
    }

}