package com.example.tarefassimples.ui.theme.model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.util.Date

class Tarefa {
        var titulo = ""
        var obs = ""
        var data = Date()

        class Tarefa constructor(var titulo: String, var obs: String, var data: Date){
                init {
                        this.titulo = titulo;
                        this.obs = obs;
                        this.data = data;
                }


        }

        @Composable
        fun criaTarefa(){
                Box {
                        Column {
                                Text("Título da tarefa")
                                Text("Data: 20/20/2042")
                                Row {
                                        Button(onClick = { /*TODO*/ }) {
                                                Text(text = "Editar")
                                        }
                                        Button(onClick = { /*TODO*/ }) {
                                                Text(text = "Finalizar")
                                        }
                                }
                        }
                }

        }



}