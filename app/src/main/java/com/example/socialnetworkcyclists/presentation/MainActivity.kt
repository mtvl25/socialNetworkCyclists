package com.example.socialnetworkcyclists.presentation


import com.example.socialnetworkcyclists.presentation.login.LoginScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val  windowSize = calculateWindowSizeClass(this)
            CyclistAppTheme(
                windowSize=windowSize.widthSizeClass
            ){
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen(onLogin = { _, _ -> })
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
