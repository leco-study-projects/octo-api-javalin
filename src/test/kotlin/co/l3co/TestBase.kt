package co.l3co

import co.l3co.configuration.octoModule
import org.koin.standalone.StandAloneContext
import org.koin.test.AutoCloseKoinTest

open class TestBase : AutoCloseKoinTest() {
    init {
        StandAloneContext.startKoin(arrayListOf(octoModule))
    }
}