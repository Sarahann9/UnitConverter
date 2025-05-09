package com.example.unitconverter

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
User Interface
 */
    @Composable
    @VisibleForTesting
    fun Converter() {
        var text by remember { mutableStateOf("") }
        var result by remember { mutableStateOf("") }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            //Title
            Text(
                text = "Unit Converter",
                color = Color.Black,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )
            Text("Input weight in pounds to convert:")

            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Pounds: ")
                },
                modifier = Modifier.testTag("textAdd")
            )
    /*
    Convert from pounds to kilograms
     */
            Button(
                onClick = {
                    val number = text.toInt() //convert users text to int
                    val kilograms = number * 0.453592 // convert to kilograms
                    result = kilograms.toString()
                },
                modifier = Modifier.testTag("buttonAdd")
            )
            { Text("Enter") }

            Text(
                text = result,
                modifier = Modifier.testTag("resultAdd")
            )

    /*
    Convert from inches to centimeters
     */
            Text("Input inches to convert to centimeters:")

            var text2 by remember { mutableStateOf("") }
            var result2 by remember { mutableStateOf("") }

            TextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Inches: ") }
            )

            Button(
                onClick = {
                    val inches = text2.toInt() //convert users text to int
                    val centimeters = inches * 2.54 // convert to centimeters
                    result2 = centimeters.toString() + " centimeters"
                }
            )
            { Text("Enter") }
            Text(text = "Result: $result2", modifier = Modifier.padding(8.dp))

    /*
    Convert from farenheit to celsius
    */
            Text("Input farenheit to convert to celsius:")

            var text3 by remember { mutableStateOf("") }
            var result3 by remember { mutableStateOf("") }

            TextField(
                value = text3,
                onValueChange = { text3 = it },
                label = { Text("Farenheit: ") }
            )

            Button(
                onClick = {
                    val farenheit = text3.toInt() //convert users text to int
                    val celsius = (farenheit - 32) * 5 / 9  // convert to celsius
                    result3 = celsius.toString() + " celsius"
                }
            )
            { Text("Enter") }
            Text(text = "Result: $result3", modifier = Modifier.padding(8.dp))
        }
    }
