package com.dev.core.component

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable

@Composable
fun SearchTextField(
    value: String,
    onValueChange: (String) -> Unit
) {

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange
    )
}