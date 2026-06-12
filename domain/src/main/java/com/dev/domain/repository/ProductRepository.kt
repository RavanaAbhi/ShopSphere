package com.dev.domain.repository

import com.dev.domain.model.Product


interface ProductRepository {

    suspend fun getProducts(): List<Product>

    suspend fun getProductById(
        productId: Int
    ): Product?

    suspend fun searchProducts(
        query: String
    ): List<Product>
}