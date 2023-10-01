package com.example.ecoearn.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCard
import androidx.compose.material.icons.filled.AddLocation
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.CardGiftcard
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
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
import com.example.ecoearn.navigation.EcoEarnAppRouter
import com.example.ecoearn.navigation.Screen
import com.example.ecoearn.ui.theme.GrayColor
import com.example.ecoearn.ui.theme.Primary
import com.example.ecoearn.ui.theme.Secondary
import com.example.ecoearn.ui.theme.TextColor

@Composable
fun GreetingTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(),
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

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
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

@Composable
fun ClickableTextComponentWithIcon(value: String, imageVector: ImageVector) {
    Box(contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = imageVector,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = value,
                fontSize = 18.sp
            )
        }
    }
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
fun ButtonComponent(value: String, isEnabled: Boolean = false, screen: Screen) {
    Button(
        onClick = {
            EcoEarnAppRouter.navigateTo(screen)
        },
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.buttonColors(Color.Transparent),
        enabled = isEnabled
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
fun ClickableLoginTextComponent(tryingToLogin:Boolean = true, onTextSelected: (String) -> Unit) {
    val initialText = if(tryingToLogin) "Already have an account? " else "Don't have an account? "
    val loginText = if(tryingToLogin) stringResource(id = R.string.login) else stringResource(id = R.string.register)

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

@Composable
fun ProfileComponent() {
    Box(
        modifier = Modifier
            .height(300.dp)
            .background(Primary)
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Profile Picture",
                modifier = Modifier.size(150.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Name",
                fontSize = 24.sp
            )
        }
    }
}


@Composable
fun CardComponent(image: Int, title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .clickable(onClick = onClick)
            .border(3.dp, Primary, RoundedCornerShape(8.dp)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(
            painter =  painterResource(id = image),
            contentDescription = title,
            modifier = Modifier
                .height(150.dp)
                .width(150.dp),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun SeeMoreComponent(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 32.dp)
            .background(GrayColor),
        contentAlignment = Alignment.CenterEnd
    ) {
        Row {
            Text(
                text = stringResource(id = R.string.see_more),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Primary,
                modifier = Modifier.clickable(onClick = onClick)
            )
            Image(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = stringResource(id = R.string.see_more),
                colorFilter = ColorFilter.tint(Primary),
            )
        }
    }
}

@Composable
fun PointsComponent(points: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                end = 8.dp,
                top = 8.dp,
            )
            .background(GrayColor),
        contentAlignment = Alignment.TopEnd
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                imageVector = Icons.Default.CardGiftcard,
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                colorFilter = ColorFilter.tint(Primary),
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "$points Points",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Primary
            )
        }
    }
}

@Composable
fun VoucherDescriptionComponent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            //TODO: change text
            text = "Voucher Description",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = TextColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            //TODO: change text
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = TextColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Primary)
        ) {
            Text(
                text = stringResource(id = R.string.contact_vendor),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                ),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun CashOutComponent() {
    Column(
modifier = Modifier
    .fillMaxWidth()
    .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.cash_out),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Primary,
            modifier = Modifier
                .padding(16.dp)
        )
        MyTextFieldComponent(
            labelValue = stringResource(id = R.string.card_number),
            imageVector = Icons.Filled.AddCard,
        )
        MyTextFieldComponent(
            labelValue = stringResource(id = R.string.bank_name),
            imageVector = Icons.Filled.AccountBalance,
        )
        MyTextFieldComponent(
            labelValue = stringResource(id = R.string.cash_out_amount),
            imageVector = Icons.Filled.Money,
        )
    }
}

@Composable
fun LocationCardComponent(distance: Int, locationLable: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                imageVector = Icons.Filled.AddLocation,
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                colorFilter = ColorFilter.tint(Primary),
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = "$distance km",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Primary
                )
                Text(
                    text = locationLable,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = TextColor
                )
            }
            Image(
                imageVector = Icons.Filled.ArrowForwardIos,
                contentDescription = null,
                modifier = Modifier.size(20.dp),
                colorFilter = ColorFilter.tint(Primary),
            )
        }
    }
}

















