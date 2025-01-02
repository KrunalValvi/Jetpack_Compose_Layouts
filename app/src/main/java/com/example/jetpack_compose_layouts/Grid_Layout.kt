package com.example.jetpack_compose_layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Grid_Layout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridLayoutApp()
        }
    }
}


@Composable
fun GridLayoutApp() {
    Text(
        text = "Hello"
    )

}

@Preview(showBackground = true)
@Composable
fun GridLayoutAppPreview() {
    GridLayoutApp()
}
