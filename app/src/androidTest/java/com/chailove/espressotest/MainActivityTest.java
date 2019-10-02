package com.chailove.espressotest;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.app.PendingIntent.getActivity;
import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.*;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    private String getResourceString(int id) {
        Context targetContext = InstrumentationRegistry.getTargetContext();
        return targetContext.getResources().getString(id);
    }

    @Test
    public void testHomeScreen() {

        String myTextFromResources = getResourceString(R.string.welcome_text);
        onView(allOf(withId(R.id.lblHeader), withText(myTextFromResources))).check(matches(isDisplayed()));

    }

    @Test
    public void testLoginButton() {

        String myTextFromResources = getResourceString(R.string.login);
        onView(allOf(withId(R.id.btnLogin), withText(myTextFromResources))).check(matches(isDisplayed()));
        onView(withId(R.id.edtUserName)).perform(clearText(),typeText("Chaitali"));
        onView(withId(R.id.edtPassword)).perform(clearText(),typeText("123456"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.btnLogin)).perform(click());


        onView(withText("User Name : Chaitali")).inRoot(withDecorView(not(is(activityActivityTestRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));

    }

    @Test
    public void testEditText() {

        String editName = getResourceString(R.string.edit_name_text);
        onView(allOf(withId(R.id.edtUserName), withHint(editName))).check(matches(isDisplayed()));
        String editpassword = getResourceString(R.string.edit_password_text);
        onView(allOf(withId(R.id.edtPassword), withHint(editpassword))).check(matches(isDisplayed()));


    }

}