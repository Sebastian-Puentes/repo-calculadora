package com.example.kotlinsito


import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewInteraction
import androidx.test.filters.LargeTest
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent

import androidx.test.InstrumentationRegistry.getInstrumentation
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*

import com.example.kotlinsito.R

import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import org.hamcrest.core.IsInstanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.anything
import org.hamcrest.Matchers.`is`

@LargeTest
@RunWith(AndroidJUnit4::class)
class KotlinsitoExpresso {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun kotlinsitoExpresso() {
        val materialButton = onView(
allOf(withId(R.id.btn5), withText("5"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
1),
1),
isDisplayed()))
        materialButton.perform(click())
        
        val materialButton2 = onView(
allOf(withId(R.id.btn0), withText("0"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
3),
1),
isDisplayed()))
        materialButton2.perform(click())
        
        val materialButton3 = onView(
allOf(withId(R.id.btnSumar), withText("+"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
3),
3),
isDisplayed()))
        materialButton3.perform(click())
        
        val materialButton4 = onView(
allOf(withId(R.id.btn2), withText("2"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
2),
1),
isDisplayed()))
        materialButton4.perform(click())
        
        val materialButton5 = onView(
allOf(withId(R.id.btn5), withText("5"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
1),
1),
isDisplayed()))
        materialButton5.perform(click())
        
        val materialButton6 = onView(
allOf(withId(R.id.btnIgual), withText("="),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
4),
2),
isDisplayed()))
        materialButton6.perform(click())
        
        val materialButton7 = onView(
allOf(withId(R.id.AC), withText("AC"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
4),
1),
isDisplayed()))
        materialButton7.perform(click())
        
        val materialButton8 = onView(
allOf(withId(R.id.btn5), withText("5"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
1),
1),
isDisplayed()))
        materialButton8.perform(click())
        
        val materialButton9 = onView(
allOf(withId(R.id.Fibonacci), withText("Fibonacci"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
4),
0),
isDisplayed()))
        materialButton9.perform(click())
        
        val materialButton10 = onView(
allOf(withId(R.id.AC), withText("AC"),
childAtPosition(
childAtPosition(
withId(R.id.tableLayout),
4),
1),
isDisplayed()))
        materialButton10.perform(click())
        }
    
    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position)
            }
        }
    }
    }
