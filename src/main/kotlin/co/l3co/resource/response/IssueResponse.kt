package com.leco.kotlinocto.resources.response

import com.fasterxml.jackson.annotation.JsonProperty

class IssueResponse(
    @JsonProperty("comments")
    val comments: Int? = null,
    @JsonProperty("closed_at")
    val closedAt: String? = null,
    @JsonProperty("created_at")
    val createdAt: String? = null,
    @JsonProperty("title")
    val title: String? = null,
    @JsonProperty("author_association")
    val authorAssociation: String? = null,
    @JsonProperty("number")
    val number: Int? = null,
    @JsonProperty("updated_at")
    val updatedAt: String? = null,
    @JsonProperty("repository_url")
    val repositoryUrl: String? = null,
    @JsonProperty("state")
    val state: String? = null,
    @JsonProperty("user")
    val user: UserResponse? = null,
    @JsonProperty("node_id")
    val nodeId: String? = null,
    @JsonProperty("id")
    val id: String? = null
)