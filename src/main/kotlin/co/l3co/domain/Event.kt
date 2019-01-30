package co.l3co.domain

import com.leco.kotlinocto.resources.response.EventResponse
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "event")
data class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID? = null,
    @OneToOne(mappedBy = "event", cascade = [CascadeType.ALL, CascadeType.MERGE])
    val issue: Issue? = null,
    @Column(name = "action")
    val action: String? = null
) {
    fun convertToResponse(): EventResponse {
        return EventResponse(
            id = id.toString(),
            action = action,
            issue = issue!!.convertToResponse()
        )
    }
}
