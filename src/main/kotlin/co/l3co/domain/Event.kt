package co.l3co.domain

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "event")
data class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    val id: UUID?,
    @OneToOne(mappedBy = "event", cascade = [CascadeType.ALL])
    val issue: Issue?,
    @Column(name = "action")
    val action: String?
)
