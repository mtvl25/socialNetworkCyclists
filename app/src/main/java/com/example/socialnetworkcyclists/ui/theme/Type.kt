package com.example.socialnetworkcyclists.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.socialnetworkcyclists.R
import androidx.compose.ui.text.font.Font


val SFProDisplay = FontFamily(
    Font(R.font.sf_pro_display_regular,    FontWeight.Normal),
    Font(R.font.sf_pro_display_semibold,   FontWeight.SemiBold),
    Font(R.font.sf_pro_display_bold,       FontWeight.Bold)
)

val SFProText = FontFamily(
    Font(R.font.sf_pro_text_regular,       FontWeight.Normal),
    Font(R.font.sf_pro_text_semibold,      FontWeight.SemiBold),
    Font(R.font.sf_pro_text_mediumitalic,        FontWeight.Normal)
)

// —————————————————
// 2) Tipografía Apple-like
// —————————————————

val AppTypography = Typography(
    // Titulares grandes
    displayLarge = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight  = FontWeight.SemiBold,
        fontSize    = 34.sp
    ),
    displayMedium = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight  = FontWeight.SemiBold,
        fontSize    = 28.sp
    ),
    displaySmall = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight  = FontWeight.SemiBold,
        fontSize    = 22.sp
    ),

    // Texto de cuerpo
    bodyLarge = TextStyle(
        fontFamily = SFProText,
        fontWeight  = FontWeight.Normal,
        fontSize    = 17.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = SFProText,
        fontWeight  = FontWeight.Normal,
        fontSize    = 15.sp
    ),

    // Labels / botones
    labelLarge = TextStyle(
        fontFamily = SFProDisplay,
        fontWeight  = FontWeight.SemiBold,
        fontSize    = 15.sp
    )
    // Puedes añadir aquí titleLarge, titleMedium, labelMedium, etc.
)