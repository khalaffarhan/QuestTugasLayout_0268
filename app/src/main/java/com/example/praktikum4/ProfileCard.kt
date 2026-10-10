package com.example.praktikum4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

/**
 * Komponen Card yang dipakai ulang oleh semua card.
 * phone bersifat nullable: jika null, baris nomor telepon tidak ditampilkan.
 */
@Composable
fun ProfileCard(
    backgroundColor: Color,
    name: String,
    phone: String?,
    address: String,
    addressColor: Color,
    nameFontFamily: FontFamily? = null,
    nameFontWeight: FontWeight = FontWeight.Bold
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(dimensionResource(id = R.dimen.card_corner)))
            .background(backgroundColor)
            .padding(dimensionResource(id = R.dimen.card_padding)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Logo kiri
        Image(
            painter = painterResource(id = R.drawable.logo_umy),
            contentDescription = stringResource(id = R.string.logo_description),
            modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size))
        )

