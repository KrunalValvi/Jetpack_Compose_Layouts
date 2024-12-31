package com.example.jetpack_compose_layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Art_Space : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpace()
        }
    }
}

@Composable
fun ArtSpace() {

}

@Preview(showBackground = true)
@Composable
fun ArtSpaceApp() {

}