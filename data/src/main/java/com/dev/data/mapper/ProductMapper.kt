package com.dev.data.mapper

import com.dev.data.dto.ProductDto
import com.dev.domain.model.Product

fun ProductDto.toDomain() =
    Product(
        id = id,
        title = title,
        description = description,
        categoryId = categoryId,
        price = price,
        imageUrl = imageUrl,
        rating = rating,
        reviewCount = reviewCount,
        isFeatured = isFeatured
    )