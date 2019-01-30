package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "issue")
class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: UUID? = null

    @Column(name = "comments")
    var comments: Int? = null

    @Column(name = "closed_at")
    var closedAt: String? = null

    @Column(name = "created_at")
    var createdAt: String? = null

    @Column(name = "title")
    var title: String? = null

    @Column(name = "url")
    var url: String? = null

    @Column(name = "labels_url")
    var labelsUrl: String? = null

    @Column(name = "author_association")
    var authorAssociation: String? = null

    @Column(name = "number")
    var number: Int? = null

    @Column(name = "updated_at")
    var updatedAt: String? = null

    @Column(name = "events_url")
    var eventsUrl: String? = null

    @Column(name = "comments_url")
    var commentsUrl: String? = null

    @Column(name = "repository_url")
    var repositoryUrl: String? = null

    @Column(name = "git_hub_id")
    var gitHubId: Int? = null

    @Column(name = "state")
    var state: String? = null

    @OneToOne
    @JoinColumn(name = "event_id")
    var event: Event? = null

    @OneToOne(mappedBy = "issue", cascade = [CascadeType.ALL])
    var user: User? = null

    @Column(name = "node_id")
    var nodeId: String? = null
}