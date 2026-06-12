package com.dev.domain.usecase.product

import com.dev.domain.repository.ProductRepository

class SearchProductsUseCase(
    private val repository: ProductRepository
) {

    suspend operator fun invoke(
        query: String
    ) = repository.searchProducts(query)
}