package com.dev.core.common.extensions

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

fun <T> Flow<T>.launchInScope(
    scope: CoroutineScope,
    action: suspend (T) -> Unit
) {
    scope.launch {
        collect(action)
    }
}