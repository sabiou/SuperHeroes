package com.example.superheroes.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.superheroes.data.repository.HeroesRepository

@Composable
fun SuperHeroesList(
    modifier: Modifier = Modifier
) {
    val heroes = HeroesRepository.heroes

    LazyColumn(
        modifier = modifier
    ) {
        items(heroes) { hero ->
            SuperHeroListItem(hero = hero)
        }
    }
}