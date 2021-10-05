plugins {
    `java-platform`
    id("libnetty.publish-conventions")
}

description = "libnetty/BOM"

dependencies {
    constraints {
        api(project(":libnetty-example"))
        api(project(":libnetty-fastcgi"))
        api(project(":libnetty-handler"))
        api(project(":libnetty-http"))
        api(project(":libnetty-http-client"))
        api(project(":libnetty-http-server"))
        api(project(":libnetty-resp"))
        api(project(":libnetty-resp3"))
        api(project(":libnetty-transport"))
    }
}
