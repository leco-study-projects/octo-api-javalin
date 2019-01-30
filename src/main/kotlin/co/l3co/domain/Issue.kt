package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "issue")
data class Issue(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID?,
    @Column(name = "comments")
    val comments: Int?,
    @Column(name = "closed_at")
    val closedAt: String?,
    @Column(name = "created_at")
    val createdAt: String?,
    @Column(name = "title")
    val title: String?,
    @Column(name = "url")
    val url: String?,
    @Column(name = "labels_url")
    val labelsUrl: String?,
    @Column(name = "author_association")
    val authorAssociation: String?,
    @Column(name = "number")
    val number: Int?,
    @Column(name = "updated_at")
    val updatedAt: String?,
    @Column(name = "events_url")
    val eventsUrl: String?,
    @Column(name = "comments_url")
    val commentsUrl: String?,
    @Column(name = "repository_url")
    val repositoryUrl: String?,
    @Column(name = "git_hub_id")
    val gitHubId: Int?,
    @Column(name = "state")
    val state: String?,
    @OneToOne
    @JoinColumn(name = "event_id")
    val event: Event?,
    @OneToOne(mappedBy = "issue", cascade = [CascadeType.ALL])
    val user: User?,
    @Column(name = "node_id")
    val nodeId: String?
)