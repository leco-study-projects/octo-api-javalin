package com.leco.kotlinocto.resources.request

import co.l3co.domain.Event
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize


@JsonIgnoreProperties(ignoreUnknown = true)
class EventRequest {
    @JsonProperty("issue")
    val issueRequest: IssueRequest? = null

    @JsonProperty("action")
    val action: String? = null

    fun convertToDomain(): Event {
        return Event(
            id = null,
            action = action,
            issue = issueRequest!!.convertToDomain()
        )
    }
}
