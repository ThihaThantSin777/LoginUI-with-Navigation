package org.thihathantsin.login.ui.with.navigation

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform