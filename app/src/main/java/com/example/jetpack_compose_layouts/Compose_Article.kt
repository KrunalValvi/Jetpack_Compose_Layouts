package com.example.jetpack_compose_layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_layouts.ui.theme.Jetpack_Compose_LayoutsTheme

class Compose_Article : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack_Compose_LayoutsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Article(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(modifier: Modifier = Modifier) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(0.dp)
            .then(modifier)
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp)
                .padding(top = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Jetpack Compose is a modern toolkit" +
                    " for building native Android UI. Compose " +
                    "simplifies and accelerates UI development" +
                    " on Android with less code, powerful tools, " +
                    "and intuitive Kotlin APIs.",
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
        )
        Text(
            text = "In this tutorial, you build a simple" +
                    " UI component with declarative functions." +
                    " You call Compose functions to say what " +
                    "elements you want and the Compose compiler" +
                    " does the rest. Compose is built around Composable " +
                    "functions. These functions let you define your app's " +
                    "UI programmatically because they let you describe how it " +
                    "should look and provide data dependencies, rather than " +
                    "focus on the process of the UI's construction, such " +
                    "as initializing an element and then attaching it to a " +
                    "parent. To create a Composable function, you add the " +
                    "@Composable annotation to the function name.",
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
                .padding(bottom = 16.dp)
                .padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    Jetpack_Compose_LayoutsTheme {
        Article()
    }
}