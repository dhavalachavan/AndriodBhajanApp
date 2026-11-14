package com.example.top10bhajans.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object DevotionalColors {
    val SaffronPrimary = Color(0xFFE65100)
    val SaffronDark = Color(0xFFBF360C)
    val SoftCreamBackground = Color(0xFFFFFDF7)
    val WarmCardSurface = Color(0xFFFAF4E8)
    val DeepBrownText = Color(0xFF3E2723)
    val MutedBrownText = Color(0xFF6D4C41)
    val SubtleGoldBorder = Color(0xFFD4AF37)
    val GoldSoftTint = Color(0xFFF3E5AB)
    val FavoriteRed = Color(0xFFC62828)
}

private val DevotionalColorScheme = lightColorScheme(
    primary = DevotionalColors.SaffronPrimary,
    onPrimary = Color.White,
    primaryContainer = DevotionalColors.GoldSoftTint,
    onPrimaryContainer = DevotionalColors.DeepBrownText,
    secondary = DevotionalColors.SubtleGoldBorder,
    onSecondary = DevotionalColors.DeepBrownText,
    background = DevotionalColors.SoftCreamBackground,
    onBackground = DevotionalColors.DeepBrownText,
    surface = DevotionalColors.WarmCardSurface,
    onSurface = DevotionalColors.DeepBrownText,
    onSurfaceVariant = DevotionalColors.MutedBrownText,
    outline = DevotionalColors.SubtleGoldBorder
)

private val DevotionalTypography = Typography(
    headlineSmall = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        color = DevotionalColors.DeepBrownText
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        color = DevotionalColors.DeepBrownText
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 22.sp,
        color = DevotionalColors.DeepBrownText
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp,
        lineHeight = 28.sp,
        color = DevotionalColors.DeepBrownText
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        color = DevotionalColors.MutedBrownText
    )
)

@Composable
fun Top10BhajansTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DevotionalColorScheme,
        typography = DevotionalTypography,
        content = content
    )
}
