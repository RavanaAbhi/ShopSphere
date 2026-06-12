package com.dev.data.repository

import com.dev.domain.model.CartItem
import com.dev.domain.repository.CartRepository

class CartRepositoryImpl : CartRepository {

    private val cartItems =
        mutableListOf<CartItem>()

    override suspend fun getCartItems() =
        cartItems

    override suspend fun addToCart(
        productId: Int
    ) {
    }

    override suspend fun removeFromCart(
        productId: Int
    ) {
    }

    override suspend fun updateQuantity(
        productId: Int,
        quantity: Int
    ) {
    }

    override suspend fun clearCart() {
        cartItems.clear()
    }
}