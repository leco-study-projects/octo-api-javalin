package co.l3co.domain

import com.leco.kotlinocto.resources.response.IssueResponse
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "issue")
data class Issue(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID? = null,
    @Column(name = "comments")
    val comments: Int? = null,
    @Column(name = "closed_at")
    val closedAt: String? = null,
    @Column(name = "created_at")
    val createdAt: String? = null,
    @Column(name = "title")
    val title: String? = null,
    @Column(name = "url")
    val url: String? = null,
    @Column(name = "labels_url")
    val labelsUrl: String? = null,
    @Column(name = "author_association")
    val authorAssociation: String? = null,
    @Column(name = "number")
    val number: Int? = null,
    @Column(name = "updated_at")
    val updatedAt: String? = null,
    @Column(name = "events_url")
    val eventsUrl: String? = null,
    @Column(name = "comments_url")
    val commentsUrl: String? = null,
    @Column(name = "repository_url")
    val repositoryUrl: String? = null,
    @Column(name = "git_hub_id")
    val gitHubId: Int? = null,
    @Column(name = "state")
    val state: String? = null,
    @OneToOne
    @JoinColumn(name = "event_id")
    var event: Event? = null,
    @OneToOne(mappedBy = "issue", cascade = [CascadeType.ALL])
    val user: User? = null,
    @Column(name = "node_id")
    val nodeId: String? = null
) {
    fun convertToResponse(): IssueResponse? {
        return IssueResponse(
            comments = comments,
            closedAt = closedAt,
            createdAt = createdAt,
            title = title,
            authorAssociation = authorAssociation,
            number = number,
            updatedAt = updatedAt,
            repositoryUrl = repositoryUrl,
            state = state,
            user = user!!.convertToDomain(),
            nodeId = nodeId,
            id = id.toString()
        )
    }
}