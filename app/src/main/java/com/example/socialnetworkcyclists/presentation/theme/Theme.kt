package com.example.socialnetworkcyclists.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf


// — Esquema oscuro —
private val DarkColorScheme: ColorScheme = darkColorScheme(
    primary       = ButtonPrimaryBg,
    onPrimary     = ButtonPrimaryText,
    background    = Background,
    onBackground  = TextPrimary,
    surface       = InputBackground,
    onSurface     = TextPrimary,
    secondary     = LinkColor,
    onSecondary   = TextPrimary,
    onSurfaceVariant   = TextPrimary.copy(alpha = 0.5f),
)

// — Esquema claro —
private val LightColorScheme: ColorScheme = lightColorScheme(
    primary       = LightButtonPrimaryBg,
    onPrimary     = LightButtonPrimaryText,
    background    = LightBackground,
    onBackground  = LightTextPrimary,
    surface       = LightInputBackground,
    onSurface     = LightTextPrimary,
    secondary     = LightLinkColor,
    onSecondary   = LightTextPrimary,

)


private val LocalDimens = staticCompositionLocalOf { DefaultDimens }


@Composable
fun ProvideDimens(
    dimens: Dimens,
    content: @Composable () -> Unit
){
    val dimensionSet= remember { dimens }
    CompositionLocalProvider(LocalDimens provides dimensionSet,content = content)
}
@Composable
fun CyclistAppTheme(
    darkTheme: Boolean = true,
    windowSize: WindowWidthSizeClass = WindowWidthSizeClass.Compact,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColorScheme else LightColorScheme

    val dimensions = if(windowSize> WindowWidthSizeClass.Compact)
        TabletDimens
    else
        DefaultDimens

    ProvideDimens(dimens = dimensions) {
        MaterialTheme(
            colorScheme = colors,
            typography  = AppTypography,
            content     = content
        )
    }

}


object CyclistAppTheme{
    val  dimens: Dimens
        @Composable
        @ReadOnlyComposable
        get() = LocalDimens.current
}