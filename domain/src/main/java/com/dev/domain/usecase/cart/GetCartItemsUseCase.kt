package com.dev.domain.usecase.cart

import com.dev.domain.repository.CartRepository

class GetCartItemsUseCase(
    private val repository: CartRepository
) {

    suspend operator fun invoke() =
        repository.getCartItems()
}