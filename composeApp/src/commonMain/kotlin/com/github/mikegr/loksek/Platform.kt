package com.github.mikegr.loksek

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform