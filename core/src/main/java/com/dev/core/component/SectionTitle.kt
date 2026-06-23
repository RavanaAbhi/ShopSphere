package com.dev.core.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SectionTitle(
    title: String,
    onSeeAllClick: (() -> Unit)? = null
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement =
            Arrangement.SpaceBetween
    ) {

        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )

        if (onSeeAllClick != null) {

            TextButton(
                onClick = onSeeAllClick
            ) {

                Text("See All")
            }
        }
    }
}