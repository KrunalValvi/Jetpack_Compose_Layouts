@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpack_compose_layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30daysapp.data.DayAppDataSource
import com.example.a30daysapp.data.daysRepository.days
import com.example.jetpack_compose_layouts.data.Datasource
//import com.example.jetpack_compose_layouts.ui.theme.Jetpack_Compose_LayoutsTheme

class Days_App : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            _30DaysAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DayApp()
                }
            }
        }
    }
//}

@Composable
fun DayApp() {
    Scaffold(
        topBar = { DayAppBar() }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues
        ) {
            items(days) { days ->
                DaysItems(
                    days = days
                )
            }
        }
    }
}

@Composable
fun DayAppBar() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Days Of Wellness",
            )
        }
    )
}

@Composable
fun DaysItems(
    days: DayAppDataSource
) {
    Card(modifier = Modifier.padding(12.dp)) {
        Column(modifier = Modifier) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                DayInfo(days.day, days.title, days.imageRes, days.description)
            }
        }
    }
}

@Composable
fun DayInfo(
    @StringRes days: Int,
    @StringRes title: Int,
    @DrawableRes imageRes: Int,
    @StringRes description: Int
) {

    var expended by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .animateContentSize()
            .padding(8.dp)
    ) {
        Text(
            text = stringResource(days),
            fontSize = 15.sp
        )
        Text(
            text = stringResource(title),
            fontSize = 20.sp
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)
                .clickable { expended = !expended },
            painter = painterResource(imageRes),
            contentDescription = null
        )
        if (expended) {
            Text(
                text = stringResource(description),
                fontSize = 16.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
//    _30DaysAppTheme {
        DayApp()
    }
//}