package co.l3co.service.implementation

import co.l3co.dao.contracts.UserDAO
import co.l3co.service.contracts.UserService
import com.leco.kotlinocto.resources.response.UserResponse

class UserServiceImpl(private val userDAO: UserDAO) : UserService {
    override fun findByLogin(login: String): List<UserResponse?> {
        return userDAO.findByLogin(login).map { user -> user.convertToDomain() }
    }
}