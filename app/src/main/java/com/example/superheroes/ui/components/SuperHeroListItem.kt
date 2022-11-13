package com.example.superheroes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.superheroes.data.model.Hero
import com.example.superheroes.ui.theme.md_theme_light_background
import com.example.superheroes.ui.theme.md_theme_light_surface


// superhero list item
@Composable
fun SuperHeroListItem(hero: Hero) {
    Card(
        modifier = Modifier
            .background(md_theme_light_background)
            .height(120.dp)
            .clip(RoundedCornerShape(16.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .background(md_theme_light_surface)
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            HeroNameAndDescription(hero)
            HeroImage(hero)
        }
    }
}