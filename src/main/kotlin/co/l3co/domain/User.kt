package co.l3co.domain

import com.leco.kotlinocto.resources.response.UserResponse
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "contributor")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID? = null,
    @OneToOne
    @JoinColumn(name = "issue_id")
    var issue: Issue? = null,
    @Column(name = "gists_url")
    val gistsUrl: String? = null,
    @Column(name = "repos_url")
    val reposUrl: String? = null,
    @Column(name = "following_url")
    val followingUrl: String? = null,
    @Column(name = "starred_url")
    val starredUrl: String? = null,
    @Column(name = "login")
    val login: String? = null,
    @Column(name = "followers_url")
    val followersUrl: String? = null,
    @Column(name = "type")
    val type: String? = null,
    @Column(name = "url")
    val url: String? = null,
    @Column(name = "subscriptions_url")
    val subscriptionsUrl: String? = null,
    @Column(name = "received_events_url")
    val receivedEventsUrl: String? = null,
    @Column(name = "avatar_url")
    val avatarUrl: String? = null,
    @Column(name = "events_url")
    val eventsUrl: String? = null,
    @Column(name = "site_admin")
    val siteAdmin: Boolean? = null,
    @Column(name = "git_hub_id")
    val gitHubId: Int? = null,
    @Column(name = "node_id")
    val nodeId: String? = null,
    @Column(name = "organizations_url")
    val organizationsUrl: String? = null
) {
    fun convertToDomain(): UserResponse? {
        return UserResponse(
            starredUrl = starredUrl,
            login = login,
            type = type,
            url = url,
            avatarUrl = avatarUrl,
            eventsUrl = eventsUrl,
            siteAdmin = siteAdmin,
            id = id.toString()
        )
    }
}
