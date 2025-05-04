package com.example.socialnetworkcyclists.presentation.components
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

import com.example.socialnetworkcyclists.R
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme



@Composable
fun HeaderImage(modifier: Modifier =Modifier) {
    Box(
        modifier = modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Image(

            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(CyclistAppTheme.dimens.headerImageSizeLarge)
        )
    }

}


@Preview(name = "HeaderImage Mobile", showBackground = true, widthDp = 360, heightDp = 200)
@Composable
fun HeaderImageMobilePreview() {
    CyclistAppTheme {
        Column(modifier = Modifier) {
            HeaderImage(Modifier.align(Alignment.CenterHorizontally)) // <— ya no pide el parámetro
        }
    }
}

