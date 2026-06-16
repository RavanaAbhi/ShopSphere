package com.dev.feature.home.event

sealed interface HomeEvent {

    data object LoadProducts : HomeEvent

    data class ProductClicked(
        val productId: Int
    ) : HomeEvent

//    data class CategoryClicked(
//        val categoryId: Int
//    ) : HomeEvent
//
//    data class SearchChanged(
//        val query: String
//    ) : HomeEvent
}