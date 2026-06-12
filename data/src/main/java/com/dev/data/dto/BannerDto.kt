package com.dev.data.dto

import kotlinx.serialization.Serializable

@Serializable
data class BannerDto(
    val id: Int,
    val title: String,
    val imageUrl: String
)