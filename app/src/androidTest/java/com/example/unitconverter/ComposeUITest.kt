package com.example.unitconverter

import org.junit.Rule
import org.junit.Test
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.unitconverter.ui.theme.UnitConverterTheme
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ComposeUITest {
    @get: Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            UnitConverterTheme {
                Converter()
            }
        }
    }


    @Test
    fun testConversion() {
        composeTestRule.onNodeWithTag("textAdd").performTextInput("10")
        composeTestRule.onNodeWithTag("buttonAdd").performClick()
        composeTestRule.onNodeWithTag("resultAdd").assertTextContains("4.53592")
    }

    @Test
    fun testExists() {
    composeTestRule.onNodeWithText("Enter").assertExists()
    }
}




