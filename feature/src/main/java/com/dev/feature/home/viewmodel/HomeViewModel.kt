package com.dev.feature.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dev.domain.usecase.product.GetProductsUseCase
import com.dev.feature.home.event.HomeEvent
import com.dev.feature.home.state.HomeUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
//    private val getCategoriesUseCase: GetCategoriesUseCase,
//    private val getBannersUseCase: GetBannersUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState = _uiState.asStateFlow()

    init {
        loadData()
    }

    private fun loadData() {

        viewModelScope.launch {

            _uiState.update {
                it.copy(isLoading = true)
            }

            val products = async { getProductsUseCase() }
//            val categories = async { getCategoriesUseCase() }
//            val banners = async { getBannersUseCase() }
        }
    }
}