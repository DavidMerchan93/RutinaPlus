package com.davidmerchan.rutinaplus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform