package com.dev.feature.home.state

import com.dev.domain.model.Banner
import com.dev.domain.model.Category
import com.dev.domain.model.Product

data class HomeUiState(
    val isLoading: Boolean = false,

    val banners: List<Banner> = emptyList(),

    val categories: List<Category> = emptyList(),

    val featuredProducts: List<Product> = emptyList(),

    val error: String? = null
)

//data class HomeUiState(
//    val isLoading: Boolean = false,
//    val products: List<Product> = emptyList(),
//    val error: String? = null
//)