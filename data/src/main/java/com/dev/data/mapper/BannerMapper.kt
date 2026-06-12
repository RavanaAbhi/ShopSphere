package com.dev.data.mapper

import com.dev.data.dto.BannerDto
import com.dev.domain.model.Banner

fun BannerDto.toDomain() =
    Banner(
        id = id,
        title = title,
        imageUrl = imageUrl
    )