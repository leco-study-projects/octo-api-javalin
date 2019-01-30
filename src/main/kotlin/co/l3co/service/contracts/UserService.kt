package co.l3co.service.contracts

import com.leco.kotlinocto.resources.response.UserResponse

interface UserService {
    fun findByLogin(login: String): List<UserResponse?>
}
