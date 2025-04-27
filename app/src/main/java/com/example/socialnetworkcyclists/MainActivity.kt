package com.example.socialnetworkcyclists


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton // Necesario para tu FAB
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import android.os.Bundle
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.socialnetworkcyclists.ui.theme.SocialNetworkCyclistsTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.socialnetworkcyclists.ui.login.ui.LoginScreen
import com.example.socialnetworkcyclists.ui.login.ui.LoginViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SocialNetworkCyclistsTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen(LoginViewModel())
                }
            }
        }
    }
}


/*
//@Preview
@Composable
fun ViewContainer(){
    //Scaffold define la estructura de la app(Esqueleto)
    Scaffold(
        //Contiene la la barra de navegacion superior
        topBar = { Toolbar()},

        //Contiene EL contenido
        content =  {Content()},

        //Contiene un floating Action button que permite añadir rutas
        floatingActionButton = {AddRoute()},

        //Contiene la Barra de navegacion inferior
        bottomBar = {Bottombar()},
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Toolbar(){
    TopAppBar(
        title = { Text("HOla Mathias")},
    // Define los colores de la topbar
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorResource(id=R.color.top_app_bar_background),
            titleContentColor = colorResource(id = R.color.top_app_bar_font),
            )
    )
}


@Composable
fun Bottombar(){
    BottomAppBar{
        Text(text = "Bottom Bar")
    }
}

*/


/*
@Composable
fun AddRoute(){
    FloatingActionButton(onClick = {}){
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add route")
    }
}

//@Preview(showBackground = true)
@Composable
fun Content() {

    var counter by rememberSaveable { mutableIntStateOf(value = 0) }
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .padding(20.dp),
    ) {

        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp),
                painter = painterResource(id = R.drawable.img),
                contentDescription = "logo",

            )


            Row(modifier = Modifier.padding(top = 5.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id=R.drawable.baseline_favorite_24),
                    contentDescription = "like",
                    modifier = Modifier
                    .clickable{
                        counter++
                    }
                )
                Text(text = counter.toString(), color = Color.White, modifier = Modifier.padding(10.dp))
            }


            Text(
                text = "Mathias",
                fontSize = 35.sp,
                color = Color.White,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
            )

        }

        item{
            Text(text = "Ruta1" ,color=Color.White, modifier = Modifier.fillMaxWidth())
            Text(text = "Ruta2" ,color=Color.White, modifier = Modifier.fillMaxWidth())
            Text(text = "Ruta3" ,color=Color.White, modifier = Modifier.fillMaxWidth())
            Text(text = "Ruta4" ,color=Color.White, modifier = Modifier.fillMaxWidth())

        }

        item{
            LazyRow(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier=Modifier.fillMaxWidth()

            ) {
                item {
                    Text(text = "java", color = Color.White, modifier = Modifier.fillMaxWidth())
                }
                item{
                    Text(text = "java", color = Color.White)
                }
                item {
                    Text( text = "hello", color=Color.DarkGray)
                }

            }
        }


    }

}
*/
