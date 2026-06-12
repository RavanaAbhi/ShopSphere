package com.dev.domain.usecase.product

import com.dev.domain.repository.ProductRepository

class GetProductsUseCase(
    private val repository: ProductRepository
) {

    suspend operator fun invoke() =
        repository.getProducts()
}