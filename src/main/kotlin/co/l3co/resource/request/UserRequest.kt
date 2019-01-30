package com.leco.kotlinocto.resources.request

import co.l3co.domain.User
import com.fasterxml.jackson.annotation.JsonProperty

object UserRequest {
    fun convertToDomain(): User? {
        return User(
            gistsUrl = gistsUrl,
            reposUrl = reposUrl,
            followingUrl = followingUrl,
            starredUrl = starredUrl,
            login = login,
            followersUrl = followersUrl,
            type = type,
            url = url,
            subscriptionsUrl = subscriptionsUrl,
            receivedEventsUrl = receivedEventsUrl,
            avatarUrl = avatarUrl,
            eventsUrl = eventsUrl,
            siteAdmin = siteAdmin,
            gitHubId = gitHubId,
            nodeId = nodeId,
            organizationsUrl = organizationsUrl
        )
    }

    @JsonProperty("gists_url")
    val gistsUrl: String? = null

    @JsonProperty("repos_url")
    val reposUrl: String? = null

    @JsonProperty("following_url")
    val followingUrl: String? = null

    @JsonProperty("starred_url")
    val starredUrl: String? = null

    @JsonProperty("login")
    val login: String? = null

    @JsonProperty("followers_url")
    val followersUrl: String? = null

    @JsonProperty("type")
    val type: String? = null

    @JsonProperty("url")
    val url: String? = null

    @JsonProperty("subscriptions_url")
    val subscriptionsUrl: String? = null

    @JsonProperty("received_events_url")
    val receivedEventsUrl: String? = null

    @JsonProperty("avatar_url")
    val avatarUrl: String? = null

    @JsonProperty("events_url")
    val eventsUrl: String? = null

    @JsonProperty("html_url")
    val htmlUrl: String? = null

    @JsonProperty("site_admin")
    val siteAdmin: Boolean? = null

    @JsonProperty("id")
    val gitHubId: Int? = null

    @JsonProperty("node_id")
    val nodeId: String? = null

    @JsonProperty("organizations_url")
    val organizationsUrl: String? = null
}
