package com.dev.domain.usecase.product

import com.dev.domain.repository.ProductRepository

class GetProductByIdUseCase(
    private val repository: ProductRepository
) {

    suspend operator fun invoke(
        productId: Int
    ) = repository.getProductById(productId)
}