package co.l3co.configuration

import org.hibernate.SessionFactory
import org.hibernate.boot.MetadataSources
import org.hibernate.boot.registry.StandardServiceRegistryBuilder


val hibernate = System.getenv("HIBERNATE_CONFIGURATION") ?: "hibernate.xml"

fun buildSessionFactory(): SessionFactory? {
    val standardRegistry = StandardServiceRegistryBuilder()
        .configure(hibernate).build()
    val metadata = MetadataSources(standardRegistry).metadataBuilder.build()
    return metadata.sessionFactoryBuilder.build()
}