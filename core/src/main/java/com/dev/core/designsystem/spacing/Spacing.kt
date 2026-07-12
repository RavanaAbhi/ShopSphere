package com.dev.core.designsystem.spacing

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Spacing(

    val xs: Dp = 4.dp,

    val sm: Dp = 8.dp,

    val md: Dp = 16.dp,

    val lg: Dp = 24.dp,

    val xl: Dp = 32.dp,

    val xxl: Dp = 40.dp
)

val LocalSpacing = Spacing()

