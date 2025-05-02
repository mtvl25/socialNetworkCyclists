package com.example.socialnetworkcyclists.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Composable
fun SeparatorWithText(
    text: String,
    modifier: Modifier = Modifier,
    lineColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    textColor: Color = lineColor,
    lineThickness: Dp = 1.dp,
    horizontalPadding: Dp = 8.dp
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Línea izquierda
        HorizontalDivider(
            modifier = Modifier
                .weight(1f),
            color     = lineColor,
            thickness = lineThickness
        )
        // Texto central
        Text(
            text = text,
            modifier = Modifier.padding(horizontal = horizontalPadding),
            style    = textStyle,
            color    = textColor
        )
        // Línea derecha
        HorizontalDivider(
            modifier = Modifier
                .weight(1f),
            color     = lineColor,
            thickness = lineThickness
        )
    }
}

