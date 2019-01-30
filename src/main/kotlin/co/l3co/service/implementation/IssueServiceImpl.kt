package co.l3co.service.implementation

import co.l3co.dao.contracts.IssueDAO
import co.l3co.service.contracts.IssueService
import com.leco.kotlinocto.resources.response.IssueResponse

class IssueServiceImpl(private val issueDAO: IssueDAO) : IssueService {
    override fun findByNumber(number: Int): List<IssueResponse?> {
        return issueDAO.findByNumber(number).map { issue -> issue.convertToResponse() }
    }

    override fun findByState(state: String): List<IssueResponse?> {
        return issueDAO.findByState(state).map { issue -> issue.convertToResponse() }
    }
}