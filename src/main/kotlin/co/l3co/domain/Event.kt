package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "event")
class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: UUID? = null

    @OneToOne(mappedBy = "event", cascade = [CascadeType.ALL])
    var issue: Issue? = null

    @Column(name = "action")
    var action: String? = null
}
