package co.l3co.configuration

import co.l3co.dao.contracts.EventDAO
import co.l3co.dao.contracts.IssueDAO
import co.l3co.dao.contracts.UserDAO
import co.l3co.dao.EventDAOImpl
import co.l3co.dao.implementation.IssueDAOImpl
import co.l3co.dao.UserDAOImpl
import co.l3co.resource.EventResource
import co.l3co.resource.IssueResource
import co.l3co.resource.UserResource
import co.l3co.service.contracts.EventService
import co.l3co.service.implementation.EventServiceImpl
import org.koin.dsl.module.module

val octoModule = module {
    single { HibernateConfiguration() }
    // DAO INJECT
    single { UserDAOImpl(get()) as UserDAO }
    single { IssueDAOImpl(get()) as IssueDAO }
    single { EventDAOImpl(get()) as EventDAO }
    // SERVICE INJECT
    single { EventServiceImpl(get()) as EventService }
    // RESOURCE INJECT
    single { EventResource(get()) }
    single { IssueResource(get()) }
    single { UserResource(get()) }
}