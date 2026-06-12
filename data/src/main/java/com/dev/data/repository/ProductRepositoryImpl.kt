package com.dev.data.repository

import com.dev.data.datasource.assets.ProductAssetDataSource
import com.dev.data.mapper.toDomain
import com.dev.domain.model.Product
import com.dev.domain.repository.ProductRepository
import kotlin.collections.filter

class ProductRepositoryImpl(
    private val dataSource: ProductAssetDataSource
) : ProductRepository {

    override suspend fun getProducts(): List<Product> {
        return dataSource
            .getProducts()
            .map { it.toDomain() }
    }

    override suspend fun getProductById(
        productId: Int
    ): Product? {

        return getProducts()
            .firstOrNull { it.id == productId }
    }

    override suspend fun searchProducts(
        query: String
    ): List<Product> {

        return getProducts().filter {
            it.title.contains(
                query,
                ignoreCase = true
            )
        }
    }
}