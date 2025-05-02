package com.example.socialnetworkcyclists.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme
import androidx.compose.ui.text.style.TextAlign


@Composable
fun CustomButton(
    modifier: Modifier=Modifier,
    text: String,
    textColor: Color,
    buttonColor:Color,
    onTap:()->Unit={}
) {
    Button(
        modifier = modifier
            .height(CyclistAppTheme.dimens.buttonHeight),

        shape = RoundedCornerShape(CyclistAppTheme.dimens.cornerRadiusLarge),
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColor
        ),
        onClick = { onTap() },
    ) {
        Text(
            text = text,
            modifier= Modifier.fillMaxWidth().align(Alignment.CenterVertically),
            textAlign = TextAlign.Center,
            style= MaterialTheme.typography.bodyLarge,
            color = textColor,
        )
        }
}



@Preview(
    name = "CustomButtonPreviewInicioSesion",
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun CustomButtonPreview(){
    CyclistAppTheme{
        CustomButton(

            text = "Iniciar Sesion",
            textColor =MaterialTheme.colorScheme.onPrimary,
            buttonColor = MaterialTheme.colorScheme.primary
        )
    }
}