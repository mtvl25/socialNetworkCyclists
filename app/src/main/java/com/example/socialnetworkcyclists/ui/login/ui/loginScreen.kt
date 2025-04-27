package com.example.socialnetworkcyclists.ui.login.ui
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.runtime.remember
import androidx.compose.foundation.Image
import androidx.compose.runtime.getValue
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.socialnetworkcyclists.R



@Composable
fun LoginScreen(viewModel: LoginViewModel) {
    //Caja que va ocupar todo el tamaño con un padding de  16 dp
    Box(Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        // Le damos al la funcion Login como parametro el modifier del padre(BOX)
        Login(Modifier.align(Alignment.Center), viewModel)
    }
}

@Composable
fun Login(modifier: Modifier, viewModel: LoginViewModel) {
    val email  :String by viewModel.email.observeAsState(initial = "")
    Column(modifier = modifier) {
        HeaderImage(Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(10.dp))
        EmailField(
            email = email,
            onEmailChange = {newEmail -> viewModel.onEmailChanged(newEmail)}
        )
        Spacer(modifier = Modifier.padding(4.dp))
        PasswordField()
        Spacer(modifier = Modifier.padding(10.dp))
        ForgotPassword(Modifier.align(Alignment.End))
        Spacer(modifier = Modifier.padding(16.dp))
        LoginButton()
    }
}

@Composable
fun LoginButton() {
    Button(
        onClick = {},
        Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red,
            disabledContainerColor = Color.Red,
            contentColor = Color.White,
            )
    ) {
        Text(text = "Iniciar sesion")
    }

}

@Composable
fun ForgotPassword(modifier: Modifier) {
    Text(
        text = "¿Olvidaste tu contraseña?",
        modifier = modifier.clickable {},
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Red
    )
}

@Composable
fun PasswordField() {
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text(text = "Contraseña")
        },
        modifier = Modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Red,
            unfocusedTextColor = Color.Red,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.LightGray,
        ),
    )
}

//Componente Para la entrada del email
@Composable
fun EmailField(email:String,onEmailChange:(String)->Unit) {

    TextField(
        value = email,
        onValueChange = onEmailChange,
        modifier = Modifier.fillMaxWidth(),
        placeholder = {
            Text(
                text = "Email"

            )
        },
        // Configura el teclado para entrada de email
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
        // Evita que al darle enter se cree una linea nueva
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.Red,
            unfocusedTextColor = Color.Red,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.LightGray,
        ),


        )
}

@Composable
fun HeaderImage(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = "Logo",
        modifier = modifier
    )
}



