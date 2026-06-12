package com.dev.data.datasource.assets

import android.content.Context
import com.dev.data.dto.CategoryDto
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

class CategoryAssetDataSource(
    private val context: Context
) {

    fun getCategories(): List<CategoryDto> {

        val json = context.assets
            .open("categories.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString(
            ListSerializer(CategoryDto.serializer()),
            json
        )
    }
}