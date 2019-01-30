package co.l3co.dao.contracts


interface CrudDAO<S, ID> {

    fun save(s: S): S
    fun findById(id: ID): S
    fun deleteById(id: ID)
    fun findAll(): List<S>
}