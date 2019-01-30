package co.l3co.service.contracts

import co.l3co.domain.User

interface UserService {
    fun findByLogin(login: String): List<User>
}
