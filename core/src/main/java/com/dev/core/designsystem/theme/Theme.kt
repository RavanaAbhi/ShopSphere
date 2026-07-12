package com.dev.core.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.dev.core.designsystem.color.Background
import com.dev.core.designsystem.color.DarkBackground
import com.dev.core.designsystem.color.DarkSurface
import com.dev.core.designsystem.color.DarkText
import com.dev.core.designsystem.color.OnPrimary
import com.dev.core.designsystem.color.Primary
import com.dev.core.designsystem.color.PrimaryContainer
import com.dev.core.designsystem.color.Secondary
import com.dev.core.designsystem.color.SecondaryContainer
import com.dev.core.designsystem.color.Surface
import com.dev.core.designsystem.shape.ShopSphereShapes
import com.dev.core.designsystem.typography.ShopSphereTypography

private val LightColors = lightColorScheme(

    primary = Primary,

    onPrimary = OnPrimary,

    primaryContainer = PrimaryContainer,

    secondary = Secondary,

    secondaryContainer = SecondaryContainer,

    background = Background,

    surface = Surface,

//    error = Error
)

private val DarkColors = darkColorScheme(

    primary = Primary,

    background = DarkBackground,

    surface = DarkSurface,

    onBackground = DarkText
)

@Composable
fun ShopSphereTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {

    MaterialTheme(

        colorScheme = if (darkTheme) DarkColors else LightColors,

        typography = ShopSphereTypography,

        shapes = ShopSphereShapes,

        content = content
    )
}