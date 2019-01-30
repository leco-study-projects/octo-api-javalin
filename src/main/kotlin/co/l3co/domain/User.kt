package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "contributor")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID?,
    @OneToOne
    @JoinColumn(name = "issue_id")
    val issue: Issue?,
    @Column(name = "gists_url")
    val gistsUrl: String?,
    @Column(name = "repos_url")
    val reposUrl: String?,
    @Column(name = "following_url")
    val followingUrl: String?,
    @Column(name = "starred_url")
    val starredUrl: String?,
    @Column(name = "login")
    val login: String?,
    @Column(name = "followers_url")
    val followersUrl: String?,
    @Column(name = "type")
    val type: String?,
    @Column(name = "url")
    val url: String?,
    @Column(name = "subscriptions_url")
    val subscriptionsUrl: String?,
    @Column(name = "received_events_url")
    val receivedEventsUrl: String?,
    @Column(name = "avatar_url")
    val avatarUrl: String?,
    @Column(name = "events_url")
    val eventsUrl: String?,
    @Column(name = "site_admin")
    val siteAdmin: Boolean?,
    @Column(name = "git_hub_id")
    val gitHubId: Int?,
    @Column(name = "node_id")
    val nodeId: String?,
    @Column(name = "organizations_url")
    val organizationsUrl: String?
)
