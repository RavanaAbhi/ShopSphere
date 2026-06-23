package com.dev.core.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage

@Composable
fun NetworkImage(
    imageUrl: String,
    modifier: Modifier = Modifier
) {
    AsyncImage(
        model = imageUrl,
        contentDescription = null,
        modifier = modifier
    )
}