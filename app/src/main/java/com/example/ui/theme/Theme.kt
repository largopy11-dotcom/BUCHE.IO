package com.example.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val BucheColorScheme = darkColorScheme(
    primary = NeonEmerald,
    onPrimary = Color(0xFF002111),
    primaryContainer = Color(0xFF003920),
    onPrimaryContainer = NeonEmerald,
    secondary = NeonCyan,
    onSecondary = Color(0xFF002026),
    secondaryContainer = Color(0xFF003640),
    onSecondaryContainer = NeonCyan,
    tertiary = NeonMagenta,
    onTertiary = Color(0xFF380016),
    background = BucheDarkBackground,
    onBackground = TextPrimary,
    surface = BucheDarkSurface,
    onSurface = TextPrimary,
    surfaceVariant = BucheDarkSurfaceVariant,
    onSurfaceVariant = TextSecondary,
    outline = BorderDark,
    error = Color(0xFFFF5252)
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = true, // Buche.io is an anime dark-mode first experience
    dynamicColor: Boolean = false, // Keep distinct neon branding
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = BucheColorScheme,
        typography = Typography,
        content = content
    )
}
