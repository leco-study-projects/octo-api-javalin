//package co.l3co.bootstrap
//
//import co.l3co.domain.Event
//import com.beust.klaxon.Klaxon
//import java.io.File
//import co.l3co.configuration.buildSessionFactory as sessionFactory
//
//val file = System.getenv("EVENT_BOOTSTRAP_PATH")
//    ?: "/Users/leco/astudio/octo-api-javalin/src/main/resources/bootstrap/event.json"
//
//fun buildEvent(): Event {
//    val rawJson = StringBuilder()
//    File(file).forEachLine { rawJson.append(it) }
//    val event = Klaxon().parse<Event>(rawJson.toString())!!
//    return event
//}
//
//fun load() {
//
//    val session = sessionFactory()!!.openSession()
//    val transaction = session.beginTransaction()
//    session.save(buildEvent())
//    transaction.commit()
//    session.close()
//}