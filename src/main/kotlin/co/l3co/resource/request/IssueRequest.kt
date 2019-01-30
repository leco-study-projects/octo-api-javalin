package com.leco.kotlinocto.resources.request

import co.l3co.domain.Issue
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonIgnoreProperties(ignoreUnknown = true)
class IssueRequest {

    @JsonProperty("comments")
    val comments: Int? = null

    @JsonProperty("closed_at")
    val closedAt: String? = null

    @JsonProperty("created_at")
    val createdAt: String? = null

    @JsonProperty("title")
    val title: String? = null

    @JsonProperty("labels")
    val labels: Any? = null

    @JsonProperty("locked")
    val locked: Any? = null

    @JsonProperty("assignees")
    val assignees: Any? = null

    @JsonProperty("assignee")
    val assignee: Any? = null

    @JsonProperty("milestone")
    val milestone: Any? = null

    @JsonProperty("url")
    val url: String? = null

    @JsonProperty("labels_url")
    val labelsUrl: String? = null

    @JsonProperty("author_association")
    val authorAssociation: String? = null

    @JsonProperty("number")
    val number: Int? = null

    @JsonProperty("updated_at")
    val updatedAt: String? = null

    @JsonProperty("events_url")
    val eventsUrl: String? = null

    @JsonProperty("html_url")
    val htmlUrl: String? = null

    @JsonProperty("comments_url")
    val commentsUrl: String? = null

    @JsonProperty("repository_url")
    val repositoryUrl: String? = null

    @JsonProperty("id")
    val gitHubId: Int? = null

    @JsonProperty("state")
    val state: String? = null

    @JsonProperty("user")
    val userRequest: UserRequest? = null

    @JsonProperty("node_id")
    val nodeId: String? = null

    fun convertToDomain(): Issue? {
        return Issue(
            comments = comments,
            closedAt = closedAt,
            createdAt = createdAt,
            title = title,
            url = url,
            labelsUrl = labelsUrl,
            authorAssociation = authorAssociation,
            number = number,
            updatedAt = updatedAt,
            eventsUrl = eventsUrl,
            commentsUrl = commentsUrl,
            repositoryUrl = repositoryUrl,
            gitHubId = gitHubId,
            state = state,
            user = userRequest!!.convertToDomain(),
            nodeId = nodeId
        )
    }
}