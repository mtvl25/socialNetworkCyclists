package com.example.socialnetworkcyclists.presentation.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color



import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme

@Composable
fun SocialButton(
    @DrawableRes iconRes: Int,
    text: String,
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    contentColor: Color,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .height(CyclistAppTheme.dimens.buttonHeight),
        shape = RoundedCornerShape(CyclistAppTheme.dimens.cornerRadiusLarge),
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor   = contentColor
        )
    ) {
        Icon(
            painter           = painterResource(iconRes),
            contentDescription = text,
            modifier           = Modifier.size(CyclistAppTheme.dimens.iconSizeSmall),
            tint               = Color.Unspecified
        )
        Spacer(Modifier.width(CyclistAppTheme.dimens.spacerSmall))
        Text(text = text, style = MaterialTheme.typography.bodyLarge)
    }
}
