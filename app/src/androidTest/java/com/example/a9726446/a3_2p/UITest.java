package com.example.a9726446.a3_2p;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by 9726446 on 29/8/18 @ LB1-MAC-024
 */
@android.support.test.filters.LargeTest
@RunWith(AndroidJUnit4.class)
public class UITest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testFt(){
        onView(withId(R.id.etFeet)).perform(click());
        onView(withId(R.id.etFeet)).perform(replaceText("2"));
        onView(withId(R.id.btnConvert)).perform(click());
        onView(withId(R.id.chkMetres)).check(matches(isNotChecked()));
        onView(withId(R.id.txtMetric)).check(matches(withText("60.96 cm")));
    }
}
