plugins {
    id("java")
    application
}

group = "com.github.AlexeyPopov1984"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application {
    mainClass = "com.github.AlexeyPopov1984"
}

tasks.test {
    useJUnitPlatform()
}