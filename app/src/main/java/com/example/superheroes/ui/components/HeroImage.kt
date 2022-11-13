package com.example.superheroes.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.superheroes.data.model.Hero

@Composable
fun HeroImage(hero: Hero) {
    Image(
        painter = painterResource(id = hero.imageRes),
        contentDescription = "Super Hero image description",
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
    )
}