package com.dev.core.common.utils

import android.content.Context

object JsonReader {

    fun readAsset(
        context: Context,
        fileName: String
    ): String {

        return context.assets
            .open(fileName)
            .bufferedReader()
            .use { it.readText() }
    }
}