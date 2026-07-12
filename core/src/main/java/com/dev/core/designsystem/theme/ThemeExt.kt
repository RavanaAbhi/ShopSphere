package com.dev.core.designsystem.theme


import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

object ShopSphereThemeExt {

    val primary: Color
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.colorScheme.primary

    val background: Color
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.colorScheme.background

    val surface: Color
        @Composable
        @ReadOnlyComposable
        get() = MaterialTheme.colorScheme.surface
}