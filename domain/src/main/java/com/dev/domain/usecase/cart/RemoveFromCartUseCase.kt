package com.dev.domain.usecase.cart

import com.dev.domain.repository.CartRepository

class RemoveFromCartUseCase(
    private val repository: CartRepository
) {

    suspend operator fun invoke(
        productId: Int
    ) {
        repository.removeFromCart(productId)
    }
}