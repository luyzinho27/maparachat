package com.maparachat.app

object MaparaChatAppState {
    @Volatile
    var isForeground: Boolean = false
    @Volatile
    var hasLaunchedOnce: Boolean = false
}

