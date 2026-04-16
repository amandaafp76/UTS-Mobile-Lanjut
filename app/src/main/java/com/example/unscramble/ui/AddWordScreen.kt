package com.example.unscramble.ui

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.unscramble.data.WordEntity
import androidx.compose.ui.Modifier

@Composable
fun AddWordScreen(viewModel: GameViewModel) {

    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Masukkan kata") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (text.isNotEmpty()) {
                viewModel.insertWord(text)
                text = ""
            }
        }) {
            Text("Simpan")
        }
    }
}