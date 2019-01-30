package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "event")
data class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID? = null,
    @OneToOne(mappedBy = "event", cascade = [CascadeType.ALL])
    val issue: Issue? = null,
    @Column(name = "action")
    val action: String? = null
) {

    init {
    }
}
