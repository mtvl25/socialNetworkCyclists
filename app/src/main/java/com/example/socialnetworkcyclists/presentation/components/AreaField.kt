package com.example.socialnetworkcyclists.presentation.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.Dp
import com.example.socialnetworkcyclists.presentation.theme.CyclistAppTheme


@Composable
fun AreaField(
    value:String,
    onValueChange: (String)->Unit,
    modifier: Modifier = Modifier,
    placeholder:String = "",
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(
        imeAction = ImeAction.Done
    ),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
    cornerRadius: Dp = CyclistAppTheme.dimens.cornerRadiusLarge,
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeholder = { Text(placeholder) },
        singleLine = singleLine,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions ,
        shape = RoundedCornerShape(cornerRadius)
    )

}

@Preview(showBackground = true)
@Composable
fun AreaFieldPreview() {
    CyclistAppTheme {
        AreaField(
            value = "",
            onValueChange = {},
            placeholder = "Introduce tu área",
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(onNext = { /* focusNext() */ })
        )
    }
}