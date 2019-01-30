package co.l3co.service.contracts

import com.leco.kotlinocto.resources.response.IssueResponse

interface IssueService {
    fun findByNumber(number: Int): List<IssueResponse?>
    fun findByState(state: String): List<IssueResponse?>
}
