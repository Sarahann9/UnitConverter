package com.example.unitconverter
import org.junit.Test
import org.junit.Assert.assertEquals


class TestMethods {
        @Test
        fun calcKilograms () {
            val number = 1 //convert users text to int
            val kilograms = number * 0.453592 // convert to kilograms
            val result = kilograms
            val expectedResult = 0.453592 //(expected)
            val delta = 0.0001
            assertEquals(expectedResult, result, delta) //compare results
        }

        @Test
        fun calcCentimeters() {
            val inches = 1 //convert users text to int
            val centimeters = inches * 2.54 // convert to centimeters
            val result2 = centimeters
            val expectedResult2 = 2.54 //(expected)
            val delta = 0.01
            assertEquals(expectedResult2, result2, delta)
        }

        @Test
        fun calcCelsius(){
            val farenheit = 100 //convert users text to int
            val celsius = (farenheit - 32) * 5 / 9 // convert to celsius
            val result3 = celsius
            val expectedResult3 = 37 //(expected)
            assertEquals(expectedResult3, result3)
        }
    }
