package com.example.socialnetworkcyclists.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle

@Composable
fun SignupPrompt(
    modifier: Modifier = Modifier,
    onRegisterClick: () -> Unit
) {
    // 1) Construimos el AnnotatedString usando withLink
    val annotated = buildAnnotatedString {
        append("¿No tienes cuenta? ")

        // withLink define un rango clicable y asocia la acción directamente
        withLink(
            link = LinkAnnotation.Clickable(
                tag = "REGISTER",
                linkInteractionListener = { onRegisterClick() }
            )
        ) {
            // dentro de este bloque el text se pinta y es clicable
            withStyle(
                style = SpanStyle(
                    color = MaterialTheme.colorScheme.secondary,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append("Regístrate")
            }
        }
    }

    // 2) Mostramos todo con un Text normal
    Text(
        text = annotated,
        style = MaterialTheme.typography.bodyMedium,
        modifier = modifier
    )
}
