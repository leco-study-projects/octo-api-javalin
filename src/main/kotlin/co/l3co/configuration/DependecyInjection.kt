package co.l3co.configuration

import co.l3co.dao.contracts.EventDAO
import co.l3co.dao.contracts.IssueDAO
import co.l3co.dao.contracts.UserDAO
import co.l3co.dao.EventDAOImpl
import co.l3co.dao.implementation.IssueDAOImpl
import co.l3co.dao.UserDAOImpl
import org.koin.dsl.module.module

val octoModule = module {
    single { HibernateConfiguration() }
    single { UserDAOImpl(get()) as UserDAO }
    single { IssueDAOImpl(get()) as IssueDAO }
    single { EventDAOImpl(get()) as EventDAO }
}