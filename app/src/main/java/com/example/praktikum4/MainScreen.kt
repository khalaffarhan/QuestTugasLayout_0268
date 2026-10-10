package com.example.praktikum4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background_screen))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = dimensionResource(id = R.dimen.screen_padding)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.header_top_padding)))

            // Header
            Text(
                text = stringResource(id = R.string.title),
                fontSize = dimensionResource(id = R.dimen.text_title).value.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_primary)
            )
            Text(
                text = stringResource(id = R.string.subtitle),
                fontSize = dimensionResource(id = R.dimen.text_subtitle).value.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_primary)
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_xlarge)))

            // Card 1 (tanpa nomor telepon, font cursive)
            ProfileCard(
                backgroundColor = colorResource(id = R.color.card_gray),
                name = stringResource(id = R.string.name_farhan),
                phone = stringResource(id = R.string.phone_farhan),
                address = stringResource(id = R.string.address_farhan),
                addressColor = colorResource(id = R.color.text_yellow),
                nameFontFamily = FontFamily(Font(R.font.dancing_script)),
                nameFontWeight = FontWeight.Normal
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_medium)))

