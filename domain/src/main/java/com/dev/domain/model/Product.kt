package com.dev.domain.model

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val categoryId: Int,
    val price: Double,
    val imageUrl: String,
    val rating: Float,
    val reviewCount: Int,
    val isFeatured: Boolean = false
)