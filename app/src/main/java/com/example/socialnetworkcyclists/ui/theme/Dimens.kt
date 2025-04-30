package com.example.socialnetworkcyclists.ui.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Dimens encapsula las medidas basadas en la normativa Apple-like
 * (unidad de sistema de 4 dp y tamaños de control estándar de iOS).
 */
data class Dimens(
    // — Bordes —
    val borderWidth:          Dp = 1.dp,   // línea fina de 1 dp según HIG

    // — Altura de botones —
    val buttonHeight:         Dp = 44.dp,  // área táctil mínima de 44

    // — Tamaños de íconos —
    val iconSizeSmall:        Dp = 24.dp,
    val iconSizeMedium:       Dp = 32.dp,
    val iconSizeLarge:        Dp = 48.dp,

    // — Rellenos (padding) —
    val paddingSmall:         Dp = 8.dp,
    val paddingMedium:        Dp = 16.dp,
    val paddingLarge:         Dp = 24.dp,

    // — Radios de esquinas —
    val cornerRadiusSmall:    Dp = 4.dp,
    val cornerRadiusMedium:   Dp = 8.dp,
    val cornerRadiusLarge:    Dp = 16.dp,

    // — Espaciadores —
    val spacerSmall:          Dp = 8.dp,
    val spacerMedium:         Dp = 16.dp,
    val spacerLarge:          Dp = 24.dp
)

/**
 * Instancia por defecto con valores Apple-like.
 */
val DefaultDimens = Dimens()


val TabletDimens = Dimens(
    borderWidth       = 1.dp,
    buttonHeight      = 48.dp,
    iconSizeSmall     = 32.dp,
    iconSizeMedium    = 48.dp,
    iconSizeLarge     = 64.dp,
    paddingSmall      = 12.dp,
    paddingMedium     = 24.dp,
    paddingLarge      = 32.dp,
    cornerRadiusSmall = 6.dp,
    cornerRadiusMedium= 12.dp,
    cornerRadiusLarge = 24.dp,
    spacerSmall       = 12.dp,
    spacerMedium      = 24.dp,
    spacerLarge       = 32.dp,

)
