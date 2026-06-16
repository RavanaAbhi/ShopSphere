package com.dev.domain.usecase.product

import com.dev.domain.repository.ProductRepository

import javax.inject.Inject

class GetProductsUseCase @Inject constructor(
    private val repository: ProductRepository
) {

    suspend operator fun invoke() =
        repository.getProducts()
}