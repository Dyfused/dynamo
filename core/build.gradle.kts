plugins {
    kotlin("jvm")
}

group = "dyfused.dynamo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    api("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.4")
    api("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.4")

//    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
//    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation(kotlin("test"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}