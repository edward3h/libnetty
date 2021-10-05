plugins {
    `maven-publish`
    signing
}

group = "org.ethelred"
version = "2.2.6"

publishing {
    repositories {
        maven {
        }
    }
}
