package com.example.testapp02;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.text.IsEmptyString.isEmptyString;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void rvIsDisplayedCase(){
        onView(withId(R.id.btn_calculate)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(isDisplayed()));
    }

    @Test
    public void simpleAddTest() {
        onView(withId(R.id.et_first)).perform(typeText("1"));
        onView(withId(R.id.et_second)).perform(typeText("5"));
        onView(withId(R.id.btn_calculate)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("6")));
    }

    @Test
    public void spaceFieldAddCase(){
        onView(withId(R.id.et_first)).perform(typeText("   2"));
        onView(withId(R.id.et_second)).perform(typeText("  2   "));
        onView(withId(R.id.btn_calculate)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));

    }

    @Test
    public void emptyFieldsAddTest(){
        onView(withId(R.id.et_first)).perform(typeText(""));
        onView(withId(R.id.et_second)).perform(typeText(""));
        onView(withId(R.id.btn_calculate)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("Вы опракинули нулевое значение")));

    }

//
//    @Test
//    public void simpleDivTest() {
//        onView(withId(R.id.et_first)).perform(typeText("10"));
//        onView(withId(R.id.et_second)).perform(typeText("5"));
//        onView(withId(R.id.btn_calculate)).perform(click());
//        onView(withId(R.id.tv_result)).check(matches(withText("2")));
//    }
//
//    @Test
//    public void divByZeroTest() {
//        onView(withId(R.id.et_first)).perform(typeText("10"));
//        onView(withId(R.id.et_second)).perform(typeText("0"));
//        onView(withId(R.id.btn_calculate)).perform(click());
//        onView(withId(R.id.tv_result)).check(matches(withText("на ноль делить нельзя!")));
//    }



}
