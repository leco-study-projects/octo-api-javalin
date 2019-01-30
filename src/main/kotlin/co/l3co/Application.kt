package co.l3co

import co.l3co.resource.EventResource
import co.l3co.resource.IssueResource
import co.l3co.resource.UserResource
import io.javalin.Javalin
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class Application(private val port: Int) : KoinComponent {

    private val userResource by inject<UserResource>()
    private val eventResource by inject<EventResource>()
    private val issueResource by inject<IssueResource>()

    fun init(): Javalin {
        val app = Javalin.create().apply {
            port(port)
            exception(Exception::class.java) { e, _ -> e.printStackTrace() }
        }.start()

        app.routes {
            app.get("/event/:action") { ctx -> eventResource.get(ctx) }
            app.post("/") { ctx -> eventResource.post(ctx) }
            app.get("/issue") { ctx -> issueResource.get(ctx) }
            app.get("/user/:login") { ctx -> userResource.get(ctx) }
        }

        return app
    }
}