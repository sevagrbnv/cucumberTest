plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("io.cucumber:cucumber-java:7.2.0")
    testImplementation("io.cucumber:cucumber-junit:7.2.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    withType<Test> {
        useJUnitPlatform()
    }
}
