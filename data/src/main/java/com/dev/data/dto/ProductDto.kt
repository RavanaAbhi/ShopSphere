package com.dev.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class ProductDto(
    val id: Int,
    val title: String,
    val description: String,
    val categoryId: Int,
    val price: Double,
    val imageUrl: String,
    val rating: Float,
    val reviewCount: Int,
    val isFeatured: Boolean
)