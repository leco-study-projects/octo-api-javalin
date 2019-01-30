package co.l3co.dao.contracts

import co.l3co.domain.Event
import java.util.*

interface EventDAO : CrudDAO<Event, UUID> {
    fun findByAction(action: String): List<Event>
}