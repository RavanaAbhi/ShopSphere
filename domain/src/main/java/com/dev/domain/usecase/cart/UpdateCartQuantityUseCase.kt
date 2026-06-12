package com.dev.domain.usecase.cart

import com.dev.domain.repository.CartRepository

class UpdateCartQuantityUseCase(
    private val repository: CartRepository
) {

    suspend operator fun invoke(
        productId: Int,
        quantity: Int
    ) {
        repository.updateQuantity(
            productId,
            quantity
        )
    }
}