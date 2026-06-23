package com.dev.core.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RatingBar(
    rating: Float
){

    Text(
        text = "⭐ $rating"
    )
}