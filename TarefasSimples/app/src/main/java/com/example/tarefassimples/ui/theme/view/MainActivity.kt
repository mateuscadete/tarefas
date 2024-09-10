package com.example.tarefassimples.ui.theme.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarefassimples.ui.theme.TarefasSimplesTheme
import com.example.tarefassimples.ui.theme.model.Tarefa

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarefasSimplesTheme {
                // A surface container using the 'background' color from the theme
                val tarefa1 = Tarefa()
                val tarefa2 = Tarefa()
                val tarefa3 = Tarefa()
                Column {
                    tarefa1.criaTarefa()
                    tarefa2.criaTarefa()
                    tarefa3.criaTarefa()
                }
            }
        }
    }
}

@Composable
fun MainGui(){

    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarefasSimplesTheme {
        // A surface container using the 'background' color from the theme
        val tarefa1 = Tarefa()
        val tarefa2 = Tarefa()
        val tarefa3 = Tarefa()
        Column {
            tarefa1.criaTarefa()
            tarefa2.criaTarefa()
            tarefa3.criaTarefa()
        }
    }
}


