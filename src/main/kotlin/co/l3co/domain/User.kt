package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "contributor")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: UUID? = null

    @OneToOne
    @JoinColumn(name = "issue_id")
    var issue: Issue? = null

    @Column(name="gists_url")
    var gistsUrl: String? = null

    @Column(name="repos_url")
    var reposUrl: String? = null

    @Column(name="following_url")
    var followingUrl: String? = null

    @Column(name="starred_url")
    var starredUrl: String? = null

    @Column(name="login")
    var login: String? = null

    @Column(name="followers_url")
    var followersUrl: String? = null

    @Column(name="type")
    var type: String? = null

    @Column(name="url")
    var url: String? = null

    @Column(name="subscriptions_url")
    var subscriptionsUrl: String? = null

    @Column(name="received_events_url")
    var receivedEventsUrl: String? = null

    @Column(name="avatar_url")
    var avatarUrl: String? = null

    @Column(name="events_url")
    var eventsUrl: String? = null

    @Column(name="site_admin")
    var siteAdmin: Boolean? = null

    @Column(name="git_hub_id")
    var gitHubId: Int? = null

    @Column(name="node_id")
    var nodeId: String? = null

    @Column(name="organizations_url")
    var organizationsUrl: String? = null
}
