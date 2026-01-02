package com.example.lisasitalianrestaurant;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;

/**
 * UI tests for Lisa's Italian Restaurant main activity
 * Tests the display of restaurant information and UI elements
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = 
        new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testRestaurantDescriptionIsDisplayed() {
        // Verify the restaurant description is visible
        onView(withId(R.id.description))
            .check(matches(isDisplayed()))
            .check(matches(withText(containsString("authentic Italian food"))));
    }

    @Test
    public void testLocationInformationIsDisplayed() {
        // Verify location information is visible and contains correct address
        onView(withId(R.id.location))
            .check(matches(isDisplayed()))
            .check(matches(withText(containsString("104 Grafton St, Dublin, CA 94568"))));
    }

    @Test
    public void testPhoneNumberIsDisplayed() {
        // Verify phone number is visible and contains correct number
        onView(withId(R.id.phone))
            .check(matches(isDisplayed()))
            .check(matches(withText(containsString("510–111–1111"))));
    }

    @Test
    public void testEmailIsDisplayed() {
        // Verify email address is visible and contains correct email
        onView(withId(R.id.email))
            .check(matches(isDisplayed()))
            .check(matches(withText(containsString("info@lisasRestaurant.com"))));
    }

    @Test
    public void testWebsiteIsDisplayed() {
        // Verify website URL is visible and contains correct URL
        onView(withId(R.id.url))
            .check(matches(isDisplayed()))
            .check(matches(withText(containsString("www.lisasrestaurant.com"))));
    }

    @Test
    public void testBusinessHoursAreDisplayed() {
        // Verify business hours are visible and contain correct hours
        onView(withId(R.id.hours))
            .check(matches(isDisplayed()))
            .check(matches(withText(containsString("11AM-10PM"))));
    }

    @Test
    public void testHeaderImageIsDisplayed() {
        // Verify the pizza emoji header image is visible
        onView(withId(R.id.pizzaemoji))
            .check(matches(isDisplayed()));
    }

    @Test
    public void testMainBackgroundImageIsDisplayed() {
        // Verify the main Italian food background image is visible
        onView(withId(R.id.mainbackground))
            .check(matches(isDisplayed()));
    }

    @Test
    public void testAllContactElementsAreVisible() {
        // Comprehensive test to ensure all contact information is displayed
        onView(withId(R.id.location)).check(matches(isDisplayed()));
        onView(withId(R.id.phone)).check(matches(isDisplayed()));
        onView(withId(R.id.email)).check(matches(isDisplayed()));
        onView(withId(R.id.url)).check(matches(isDisplayed()));
        onView(withId(R.id.hours)).check(matches(isDisplayed()));
    }

    @Test
    public void testAllImagesAreVisible() {
        // Comprehensive test to ensure all images are displayed
        onView(withId(R.id.pizzaemoji)).check(matches(isDisplayed()));
        onView(withId(R.id.mainbackground)).check(matches(isDisplayed()));
    }
}