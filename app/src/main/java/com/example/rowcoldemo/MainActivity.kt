package com.example.rowcoldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rowcoldemo.ui.theme.RowColDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowColDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Example4()
    }
}


@Composable
fun Example4() {

    Row(
        modifier = Modifier
            .size(width = 400.dp, height = 200.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun Example5() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .size(width = 400.dp, height = 200.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}

@Composable
fun Example6() {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .width(250.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun Example9() {
    Row(
        horizontalArrangement = Arrangement.End,
        modifier = Modifier
            .size(width = 400.dp, height = 200.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun Example10() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .height(400.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun Example11() {

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .width(1000.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun Example12() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .width(1000.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun Example13() {

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .width(1000.dp)
            .border(1.dp, Color.Gray)
    ) {
        TextCell("1")
        TextCell("2")
        TextCell("3")
    }
}


@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {
    val cellModifier = modifier
        .padding(4.dp)
        .size(100.dp, 100.dp)
        .border(width = 4.dp, color = Color.Black)

    Text(
        text = text,
        modifier = cellModifier.then(modifier),
        fontSize = 80.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

// ▼▼▼ ПРЕВЬЮ ▼▼▼
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    RowColDemoTheme {
        MainScreen()
    }
}


@Preview
@Composable
fun Example4Preview() {
    RowColDemoTheme {
        Example4()
    }
}
