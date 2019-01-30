package com.leco.kotlinocto.resources.response

import com.fasterxml.jackson.annotation.JsonProperty

class EventResponse(
    @JsonProperty("id")
    val id: String? = null,

    @JsonProperty("issue")
    val issue: IssueResponse? = null,

    @JsonProperty("action")
    val action: String? = null
)
