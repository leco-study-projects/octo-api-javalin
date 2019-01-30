package co.l3co.resource

import co.l3co.service.contracts.IssueService
import io.javalin.Context

class IssueResource(private val issueService: IssueService) {

    fun get(ctx: Context) {
        ctx.json(
            when (ctx.queryParam("type")) {
                "number" -> issueService.findByNumber(ctx.queryParam("value")!!.toInt())
                "state" -> issueService.findByState(ctx.queryParam("value")!!)
                else -> ctx.json("{}")
            }
        )
    }
}