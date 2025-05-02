package com.example.socialnetworkcyclists.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialnetworkcyclists.R
import com.example.socialnetworkcyclists.presentation.components.AreaField
import com.example.socialnetworkcyclists.presentation.components.AutoResizedText
import com.example.socialnetworkcyclists.presentation.components.CustomButton
import com.example.socialnetworkcyclists.presentation.components.HeaderImage
import com.example.socialnetworkcyclists.presentation.components.SeparatorWithText
import com.example.socialnetworkcyclists.presentation.components.SignupPrompt
import com.example.socialnetworkcyclists.presentation.components.SocialButton

import com.example.socialnetworkcyclists.presentation.theme.AppleButtonBgDark

import com.example.socialnetworkcyclists.presentation.theme.AppleButtonTextDark
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme

import com.example.socialnetworkcyclists.presentation.theme.GoogleButtonBgDark
import com.example.socialnetworkcyclists.presentation.theme.GoogleButtonTextDark


@Composable
fun LoginScreen(
    onLogin: (String, String) -> Unit
){
    // Estado para usuario y contraseña
    val (username, setUsername) = rememberSaveable { mutableStateOf("") }
    val (password, setPassword) = rememberSaveable { mutableStateOf("") }
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(CyclistAppTheme.dimens.paddingLarge),
        contentAlignment = Alignment.TopCenter   // centra horizontalmente
    ){


    Column (
        modifier = Modifier
            
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        // 1. Encabezado principal
        AutoResizedText(
            text = "Bienvenido de nuevo",
            textStyle = MaterialTheme.typography.displayLarge.copy(
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerSmall))
        // 2. Subtítulo instructivo
        AutoResizedText(
            text = "Inicia sesion para continuar",
            textStyle = MaterialTheme.typography.titleMedium.copy(
                color = MaterialTheme.colorScheme.onSurfaceVariant ,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
            )
        )
        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerLarge))
        // 3. Logo centrado
        HeaderImage()
        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerLarge))

        AreaField(
            value = username,
            onValueChange = setUsername,
            modifier = Modifier.fillMaxWidth(),
            placeholder = "Correo electrónico",
            keyboardOptions = androidx.compose.foundation.text.KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            keyboardActions = androidx.compose.foundation.text.KeyboardActions(
                onNext = { /* TODO: mover foco al siguiente campo */ }
            )
        )
        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerMedium))

        // 5. Campo de contraseña
        AreaField(
            value = password,
            onValueChange = setPassword,
            modifier = Modifier.fillMaxWidth(),
            placeholder = "Contraseña",
            keyboardOptions = androidx.compose.foundation.text.KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = androidx.compose.foundation.text.KeyboardActions(
                onDone = { onLogin(username, password) }
            ),
            singleLine = true

        )

        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerLarge))

        // 6. Botón de inicio de sesión
        CustomButton(
            text = "Iniciar sesión",
            textColor = MaterialTheme.colorScheme.onPrimary,
            buttonColor = MaterialTheme.colorScheme.primary,
            modifier = Modifier
                .fillMaxWidth()
                .height(CyclistAppTheme.dimens.buttonHeight)
        ) {
            onLogin(username, password)
        }

        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerLarge))

        // Texto separador
        SeparatorWithText(text = "o continuar con")
        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerMedium))

        // Botón de Apple
        SocialButton(
            iconRes         = R.drawable.ic_apple,           // tu recurso de logo Apple
            text            = "Apple",
            backgroundColor = AppleButtonBgDark ,
            contentColor    = AppleButtonTextDark,
            modifier        = Modifier.fillMaxWidth(),
            onClick         = { /* acción Apple Sign-In */ }
        )
        Spacer(modifier = Modifier.height(CyclistAppTheme.dimens.spacerSmall))

        // Botón de Google
        SocialButton(
            iconRes         = R.drawable.ic_google,          // tu recurso de logo Google
            text            = "Google",
            backgroundColor = GoogleButtonBgDark,
            contentColor    = GoogleButtonTextDark,
            modifier        = Modifier.fillMaxWidth(),
            onClick         = { /* acción Google Sign-In */ }
        )
        Spacer(Modifier.height(CyclistAppTheme.dimens.spacerLarge))
        SignupPrompt() {}
    }

    }



}


@Preview(
    name = "LoginScreenPreview",
    showBackground=true,
)

@Composable
fun LoginScreenPreview(){
    CyclistAppTheme(darkTheme = true) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color    = MaterialTheme.colorScheme.background
        ) {

            LoginScreen(onLogin = { _, _ -> })
        }
    }
}