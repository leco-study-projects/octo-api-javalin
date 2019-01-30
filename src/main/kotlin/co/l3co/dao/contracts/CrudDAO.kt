package co.l3co.dao.contracts

import co.l3co.domain.Event


interface CrudDAO<S, ID> {

    fun save(s: S): S?
    fun findById(id: ID): S?
    fun deleteById(id: ID)
    fun findAll(): List<S>
}