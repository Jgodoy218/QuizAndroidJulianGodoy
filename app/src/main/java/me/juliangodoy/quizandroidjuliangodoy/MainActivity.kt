package me.juliangodoy.quizandroidjuliangodoy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.juliangodoy.quizandroidjuliangodoy.ui.theme.QuizAndroidJulianGodoyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrimeraPantalla() {
    Row(modifier = Modifier
        .background(Color.Green)

    ) {
        Column(modifier = Modifier
                .background(Color.Yellow).
                 fillMaxSize()
        ){ Text(text = "Item 1",
                    modifier = Modifier
                        .background(Color.Yellow).
                        fillMaxSize()
                        .padding(10.dp)

        )
                }
    }
}