package com.example.superheroes.ui.components

import androidx.annotation.Dimension
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import com.example.superheroes.data.model.Hero

@Composable
fun HeroNameAndDescription(hero: Hero) {
    Column(
    ) {
        Text(
            stringResource(
                id = hero.nameRes
            ),
            style = MaterialTheme.typography.h3
        )
        Text(
            stringResource(
                id = hero.descriptionRes
            ),
            style = MaterialTheme.typography.body1,
        )
    }
}