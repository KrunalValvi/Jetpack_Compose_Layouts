package com.example.jetpack_compose_layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_layouts.data.Hero
import com.example.jetpack_compose_layouts.data.HeroesRepository.heroes
import com.example.jetpack_compose_layouts.ui.theme.Jetpack_Compose_LayoutsTheme

class Superheroes : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_LayoutsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    SuperHeroesApp()
                }
            }
        }
    }
}

@Composable
fun SuperHeroesApp() {
    Scaffold(
        topBar = { SuperHeroesAppBar() }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues
        ) {
            items(heroes) { hero ->
                HeroItems(
                    hero = hero,
                    modifier = Modifier
                        .padding(8.dp)
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuperHeroesAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
}

@Composable
fun HeroItems(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(modifier = modifier) {
        Column() {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .height(72.dp)
            ) {
                HeroInfo(hero.nameRes, hero.descriptionRes)
                HeroIcon(hero.imageRes)
            }
        }
    }
}


@Composable
fun HeroIcon(
    @DrawableRes image: Int,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier
            .size(100.dp)
            .padding(2.dp)
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop,
        painter = painterResource(image),
        contentDescription = null
    )

}

@Composable
fun HeroInfo(
    @StringRes heroName: Int,
    @StringRes herodescriptiom: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(260.dp)
    ) {
        Text(
            text = stringResource(heroName),
            style = MaterialTheme.typography.displaySmall,
            modifier = Modifier.padding(top = 0.dp)
        )
        Text(
            text = stringResource(herodescriptiom),
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 0.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SuperHeroesAppPreview() {
    Jetpack_Compose_LayoutsTheme {
        SuperHeroesApp()
    }
}

