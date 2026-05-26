package com.dev.core.common.dispatcher

import kotlinx.coroutines.Dispatchers

class DefaultDispatcherProvider : DispatcherProvider {

    override val main = Dispatchers.Main

    override val io = Dispatchers.IO

    override val default = Dispatchers.Default
}