package com.dev.data.datasource.assets

import android.content.Context
import com.dev.data.dto.BannerDto
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

class BannerAssetDataSource {

    private val context: Context

    constructor(context: Context) {
        this.context = context
    }

    fun getBanners(): List<BannerDto> {

        val json = context.assets
            .open("banners.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString(
            ListSerializer(BannerDto.serializer()),
            json
        )
    }
}