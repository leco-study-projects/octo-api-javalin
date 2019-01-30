package co.l3co.dao.contracts

import co.l3co.domain.Issue
import java.util.*

interface IssueDAO : CrudDAO<Issue, UUID> {
    fun findByState(state: String): List<Issue>
    fun findByNumber(number: Int): List<Issue>
}