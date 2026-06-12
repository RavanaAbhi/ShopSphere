package com.dev.domain.usecase.auth

import com.dev.domain.repository.AuthRepository

class LoginUseCase(
    private val repository: AuthRepository
) {

    suspend operator fun invoke(
        email: String,
        password: String
    ) = repository.login(
        email,
        password
    )
}