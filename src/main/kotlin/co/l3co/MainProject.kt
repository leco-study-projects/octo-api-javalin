package co.l3co

import co.l3co.bootstrap.load
import io.javalin.Javalin

val port: String = System.getenv("APPLICATION_PORT") ?: "7000"

fun main() {
    load()
    val app = Javalin.create().start(port.toInt())
    app.get("/") { ctx -> ctx.result("{\"message\": \"ok\"}") }
}