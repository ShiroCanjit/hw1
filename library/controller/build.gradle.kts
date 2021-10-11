plugins {
    java
    kotlin("jvm") version "1.4.31"
    `kotlin-dsl`
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    compileOnly(group = "org.projectlombok", name = "lombok", version = "1.18.4")
    compileOnly(group = "com.intellij", name = "annotations", version = "12.0")
    implementation ("com.google.code.gson:gson:2.8.8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
tasks.register<JavaExec>("startMainClas") {
    group = "launchon"

    mainClass.set( "controller.classes.Application.java")

    classpath = sourceSets["main"].runtimeClasspath
}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}