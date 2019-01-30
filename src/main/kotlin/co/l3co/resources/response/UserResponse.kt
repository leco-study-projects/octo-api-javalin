package com.leco.kotlinocto.resources.response

import com.fasterxml.jackson.annotation.JsonProperty

class UserResponse(
    @JsonProperty("starred_url")
    val starredUrl: String? = null,

    @JsonProperty("login")
    val login: String? = null,

    @JsonProperty("type")
    val type: String? = null,

    @JsonProperty("url")
    val url: String? = null,

    @JsonProperty("avatar_url")
    val avatarUrl: String? = null,

    @JsonProperty("events_url")
    val eventsUrl: String? = null,

    @JsonProperty("html_url")
    val htmlUrl: String? = null,

    @JsonProperty("site_admin")
    val siteAdmin: Boolean? = null,

    @JsonProperty("id")
    val id: String? = null
)
