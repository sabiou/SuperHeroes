package com.example.superheroes

import android.annotation.SuppressLint
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.ui.components.SuperHeroesList
import com.example.superheroes.ui.theme.SuperheroesTheme
import com.example.superheroes.ui.theme.md_theme_light_background
import com.example.superheroes.ui.theme.md_theme_light_onPrimary

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            backgroundColor = md_theme_light_background,
                            modifier = Modifier
                                .height(56.dp),
                            elevation = 0.dp
                        )
                        {
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Superheroes",
                                color = md_theme_light_onPrimary,
                                style = MaterialTheme.typography.h1,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                ) {
                    SuperHeroesList()
                }
            }
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun GreetingPreview() {
    SuperheroesTheme {
        SuperHeroesList()
    }
}