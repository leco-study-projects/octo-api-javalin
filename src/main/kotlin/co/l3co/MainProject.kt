package co.l3co

import co.l3co.bootstrap.LoadEvent
import co.l3co.configuration.octoModule
import org.koin.standalone.StandAloneContext.startKoin

val port: String = System.getenv("APPLICATION_PORT") ?: "7000"

fun main() {
    startKoin(arrayListOf(octoModule))

    LoadEvent().load()

    Application(port = port.toInt()).init()
}
