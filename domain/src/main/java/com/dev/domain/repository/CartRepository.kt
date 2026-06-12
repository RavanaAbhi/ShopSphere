package com.dev.domain.repository

import com.dev.domain.model.CartItem

interface CartRepository {

    suspend fun getCartItems(): List<CartItem>

    suspend fun addToCart(
        productId: Int
    )

    suspend fun removeFromCart(
        productId: Int
    )

    suspend fun updateQuantity(
        productId: Int,
        quantity: Int
    )

    suspend fun clearCart()
}