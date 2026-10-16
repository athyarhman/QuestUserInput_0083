package com.example.pampertemuan4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf

@Composable
fun FormDataDiri(modifier: Modifier){
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
}
