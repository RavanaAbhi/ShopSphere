package com.dev.domain.usecase.auth

import com.dev.domain.repository.AuthRepository

class RegisterUseCase(
    private val repository: AuthRepository
) {

    suspend operator fun invoke(
        name: String,
        email: String,
        password: String
    ) = repository.register(
        name,
        email,
        password
    )
}