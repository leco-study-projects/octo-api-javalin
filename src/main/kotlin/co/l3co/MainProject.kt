package co.l3co

import co.l3co.bootstrap.LoadEvent
import co.l3co.configuration.octoModule
import io.javalin.Javalin
import org.koin.standalone.StandAloneContext.startKoin

val port: String = System.getenv("APPLICATION_PORT") ?: "7000"

fun main() {
    startKoin(arrayListOf(octoModule))

    LoadEvent().load()

    val app = Javalin.create().start(port.toInt())
    app.routes {
        app.get("/") { ctx -> ctx.result("{\"message\": \"ok\"}") }
    }

}