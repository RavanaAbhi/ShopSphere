package com.dev.core.component

import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.dev.domain.model.Category

@Composable
fun CategoryChip(
    category: Category,
    modifier: Modifier = Modifier
) {
    AssistChip(
        onClick = { },
        label = {
            Text(category.name)
        },
        modifier = modifier
    )
}