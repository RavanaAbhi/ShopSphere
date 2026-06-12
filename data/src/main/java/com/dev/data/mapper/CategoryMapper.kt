package com.dev.data.mapper

import com.dev.data.dto.CategoryDto
import com.dev.domain.model.Category

fun CategoryDto.toDomain() =
    Category(
        id = id,
        name = name,
        imageUrl = imageUrl
    )