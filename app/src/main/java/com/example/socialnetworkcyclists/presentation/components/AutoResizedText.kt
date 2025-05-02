package com.example.socialnetworkcyclists.presentation.components
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme


//Componente que contiene un texto que se ajusta automaticamente
@Composable
fun AutoResizedText(
    //recibe un modifier para modificar  el padding tamaño etc
    modifier: Modifier= Modifier,

    text:String,
    //adquiere el estilo de texto declarado en Type.kt para el MaterialTheme
    textStyle: TextStyle =MaterialTheme.typography.displayLarge

){
    //Almacena el style del texto para rrecordarlo cuando se vuelva a crear la vista debido a que el Texto se desborda
    var headerTextStyle by remember { mutableStateOf(textStyle)}

    //Taza de ajustamiento del texto
    val fontSizeFactor = 0.95

    //Componente de Texto
    Text(
        text,
        //
        modifier = modifier.fillMaxWidth(),
        //SI se desborda el texto no se pasa para abajo en dos lineas.
        softWrap = false,
        //el estilo de este componente va a ser lo guardado en la variable headear style
        style = headerTextStyle,
        //si se presenta desbordamiento el texto se ajustara automaticamente.
        onTextLayout = { result ->
            if (result.didOverflowWidth){
                headerTextStyle= headerTextStyle.copy(
                    fontSize = headerTextStyle.fontSize*fontSizeFactor
                )
            }

        }

    )
}


@Preview(
    name = "AutoResizedTextPreview",
    showBackground = true,
)
@Composable
fun AutoResizedTextPreview(){
    CyclistAppTheme{
        AutoResizedText(
            text="Bienvenido de nuevo" ,
        )
    }
}