package com.coooldoggy.playconsoleforios

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform