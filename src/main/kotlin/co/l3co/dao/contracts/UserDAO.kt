package co.l3co.dao.contracts

import co.l3co.domain.User
import java.util.*

interface UserDAO : CrudDAO<User, UUID> {
    fun findByLogin(login: String): List<User>
}