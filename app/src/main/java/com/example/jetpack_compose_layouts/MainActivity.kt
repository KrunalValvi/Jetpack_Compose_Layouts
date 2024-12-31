package com.example.jetpack_compose_layouts

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_layouts.ui.theme.Jetpack_Compose_LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Jetpack_Compose_LayoutsTheme {
                MainScreen(
                    onBirthdayClick = {
                        startActivity(Intent(this, Birthday_Card::class.java))
                    },
                    onBusinessClick = {
                        startActivity(Intent(this, Business_Card::class.java))
                    },
                    onComposeArticleClick = {
                        startActivity(Intent(this, Compose_Article::class.java))
                    },
                    onComposeQuadrantClick = {
                        startActivity(Intent(this, Compose_Quadrant::class.java))
                    },
                    onTaskManagerClick = {
                        startActivity(Intent(this, Task_Manager::class.java))
                    },
                    onDiceRollerClick = {
                        startActivity(Intent(this, Dice_Roller::class.java))
                    },
                    onLemonadeClick = {
                        startActivity(Intent(this, Lemonade_app::class.java))
                    },
                    onTipCalculatorClick = {
                        startActivity(Intent(this, TipTimeTheme::class.java))
                    },
                    onArtSpaceClick = {
                        startActivity(Intent(this, Art_Space::class.java))
                    }
                )
            }
        }
    }
}


@Composable
fun MainScreen(
    onBirthdayClick: () -> Unit,
    onBusinessClick: () -> Unit,
    onComposeArticleClick: () -> Unit,
    onComposeQuadrantClick: () -> Unit,
    onTaskManagerClick: () -> Unit,
    onDiceRollerClick: () -> Unit,
    onLemonadeClick: () -> Unit,
    onTipCalculatorClick: () -> Unit,
    onArtSpaceClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Jetpack Compose Layouts",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 30.dp) // Add spacing below the header
        )

        ActionCard(title = "Birthday Card", onClick = onBirthdayClick)
        ActionCard(title = "Business Card", onClick = onBusinessClick)
        ActionCard(title = "Compose Article", onClick = onComposeArticleClick)
        ActionCard(title = "Compose Quadrant", onClick = onComposeQuadrantClick)
        ActionCard(title = "Task Manager", onClick = onTaskManagerClick)

        Text(
            text = "Interactive Layouts",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontFamily = androidx.compose.ui.text.font.FontFamily.Serif,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 30.dp)
                .padding(bottom = 20.dp)
        )

        ActionCard(title = "Dice Roller", onClick = onDiceRollerClick)
        ActionCard(title = "Make Lemonade ", onClick = onLemonadeClick)
        ActionCard(title = "Tip Calculator ", onClick = onTipCalculatorClick)
        ActionCard(title = "Art Space ", onClick = onArtSpaceClick)
    }
}


@Composable
fun ActionCard(title: String, onClick: () -> Unit) {
    androidx.compose.material3.Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = androidx.compose.material3.CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    Jetpack_Compose_LayoutsTheme {
        MainScreen(
            onBirthdayClick = {},
            onBusinessClick = {},
            onComposeArticleClick = {},
            onComposeQuadrantClick = {},
            onTaskManagerClick = {},
            onDiceRollerClick = {},
            onLemonadeClick = {},
            onTipCalculatorClick = {},
            onArtSpaceClick = {}
        )
    }
}
