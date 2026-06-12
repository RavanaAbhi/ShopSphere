package com.dev.data.datasource.assets

import android.content.Context
import com.dev.data.dto.ProductDto
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json

class ProductAssetDataSource(
    private val context: Context
) {

    fun getProducts(): List<ProductDto> {

        val json = context.assets
            .open("products.json")
            .bufferedReader()
            .use { it.readText() }

        return Json.decodeFromString(
            ListSerializer(ProductDto.serializer()),
            json
        )
    }
}