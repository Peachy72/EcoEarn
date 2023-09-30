package com.example.ecoearn.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecoearn.R
import com.example.ecoearn.ui.theme.GrayColor
import com.example.ecoearn.ui.theme.Primary
import com.example.ecoearn.ui.theme.Secondary
import com.example.ecoearn.ui.theme.TextColor


@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextFieldComponent(labelValue: String, imageVector: ImageVector) {

    val textValue = remember {
        mutableStateListOf("")
    }

    OutlinedTextField(
        value = textValue[0],
        onValueChange = { textValue[0] = it },
        label = { Text(text = labelValue) },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        textStyle = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Primary,
            unfocusedBorderColor = Primary,
            cursorColor = Primary
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = androidx.compose.ui.text.input.ImeAction.Next
        ),
        leadingIcon = {
            Icon(
                imageVector = imageVector,
                contentDescription = null
            )
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextFieldComponent(labelValue: String, leadingImage: ImageVector, trailingImage: ImageVector) {

    val password = remember {
        mutableStateListOf("")
    }

    val passwordVisible = remember {
        mutableStateListOf(false)
    }

    OutlinedTextField(
        value = password[0],
        onValueChange = { password[0] = it },
        label = { Text(text = labelValue) },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        textStyle = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Primary,
            unfocusedBorderColor = Primary,
            cursorColor = Primary
        ),
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = androidx.compose.ui.text.input.ImeAction.Next
        ),
        leadingIcon = {
            Icon(
                imageVector = leadingImage,
                contentDescription = null
            )
        },
        trailingIcon = {
            val image = if (passwordVisible[0]) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }

            var description = if (passwordVisible[0]) {
                stringResource(id = R.string.hide_password)
            } else {
                stringResource(id = R.string.show_password)
            }

            IconButton(onClick = { passwordVisible[0] = !passwordVisible[0] }) {
                Icon(
                    imageVector = image,
                    contentDescription = description
                )
            }
        },
        visualTransformation = if (passwordVisible[0]) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        }
    )
}

@Composable
fun CheckboxComponent(value: String, onTextSelected: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val checkState = remember { mutableStateListOf(false) }

        Checkbox(
            checked = checkState[0],
            onCheckedChange = { checkState[0] = !checkState[0] },
        )
        
        ClickableTextComponent(value = value, onTextSelected = onTextSelected)
    }
}

@Composable
fun ClickableTextComponent(value: String, onTextSelected: (String) -> Unit) {
    val initialText = "By continuing you accept our "
    val privacyPolicyText = "Privacy Policy"
    val andText = " and "
    val termsAndConditionsText = "Terms and Conditions"

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Primary)){
            pushStringAnnotation(
                tag = privacyPolicyText,
                annotation = privacyPolicyText
            )
            append(privacyPolicyText)
        }
        append(andText)
        withStyle(style = SpanStyle(color = Primary)){
            pushStringAnnotation(
                tag = termsAndConditionsText,
                annotation = termsAndConditionsText
            )
            append(termsAndConditionsText)
        }
    }

    ClickableText(
        text = annotatedString,
        onClick ={offset ->
            annotatedString.getStringAnnotations(offset,offset)
                .firstOrNull()?.also { span->
                if(span.item == termsAndConditionsText || span.item == privacyPolicyText ) {
                        onTextSelected(span.item)
                }
            }
        },
    )
}

@Composable
fun ButtonComponent(value: String) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp)
                .background(
                    brush = Brush.horizontalGradient(listOf(Secondary, Primary)),
                    shape = RoundedCornerShape(50.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = value,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Composable
fun DividerTextComponent() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = Primary,
            thickness = 1.dp
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = stringResource(id = R.string.or),
            fontSize = 16.sp,
            color = TextColor,
        )
        Spacer(modifier = Modifier.width(8.dp))
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            color = Primary,
            thickness = 1.dp
        )
    }
}

@Composable
fun ClickableLoginTextComponent(onTextSelected: (String) -> Unit) {
    val initialText = "Already have an account? "
    val loginText = stringResource(id = R.string.login)

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Primary)){
            pushStringAnnotation(
                tag = loginText,
                annotation = loginText
            )
            append(loginText)
        }
    }

    ClickableText(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        ),
        text = annotatedString,
        onClick ={offset ->
            annotatedString.getStringAnnotations(offset,offset)
                .firstOrNull()?.also { span->
                    if(span.item == loginText) {
                        onTextSelected(span.item)
                    }
                }
        },
    )
}

@Composable
fun ClickableSignUpTextComponent(onTextSelected: (String) -> Unit) {
    val initialText = "Don't have an account? "
    val loginText = stringResource(id = R.string.register)

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Primary)){
            pushStringAnnotation(
                tag = loginText,
                annotation = loginText
            )
            append(loginText)
        }
    }

    ClickableText(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        ),
        text = annotatedString,
        onClick ={offset ->
            annotatedString.getStringAnnotations(offset,offset)
                .firstOrNull()?.also { span->
                    if(span.item == loginText) {
                        onTextSelected(span.item)
                    }
                }
        },
    )
}

@Composable
fun ClickableForgotPasswordTextComponent(onTextSelected: (String) -> Unit) {
    val forgotPasswordText = stringResource(id = R.string.forgot_password)

    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Primary)){
            pushStringAnnotation(
                tag = forgotPasswordText,
                annotation = forgotPasswordText
            )
            append(forgotPasswordText)
        }
    }

    ClickableText(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        ),
        text = annotatedString,
        onClick ={offset ->
            annotatedString.getStringAnnotations(offset,offset)
                .firstOrNull()?.also { span->
                    if(span.item == forgotPasswordText) {
                        onTextSelected(span.item)
                    }
                }
        },
    )
}















