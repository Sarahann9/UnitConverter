package com.example.unitconverter

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest

@HiltAndroidTest
class HiltInjectionTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @get:Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        hiltRule.inject()
    }

    @Test
    fun testPounds() {
        composeRule.onNodeWithTag("textAdd").performTextInput("10")
        composeRule.onNodeWithTag("buttonAdd").performClick()
        composeRule.onNodeWithTag("resultAdd").assertTextContains("4.53592")
    }
}




