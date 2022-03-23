package com.example.testapp02;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MyMathTest {

    private MyMath math;

    @Before
    public void setUp(){
        math = new MyMath();
    }

    @Test
    public void simpleAddCase(){
        assertEquals("3", math.add("1", "2"));

    }

    @Test
    public void nullValuesAddCase(){
        assertEquals("Вы опракинули нулевое значение", math.add("", ""));

    }

    @Test
    public void withLettersAddCase() {
        assertEquals("Вы опракинули буквы", math.add("idnkd", "sfcjncxx"));
    }

    @Test
    public void withSymbolsAddCase() {
        assertEquals("Вы опракинули точку", math.add("2.5", "0"));
    }

    @Test
    public void withSpaceAddCase() {
        assertEquals("3", math.add("  1 ", " 2 "));
    }

    @Test
    public void divCase() {
        assertEquals("50", math.div("100", "2"));
    }

    @Test
    public void divByZeroCase() {
        assertEquals("на ноль делить нельзя!", math.div("100", "0"));
    }
    
    @After
    public void tearDown(){
        math = null;
    }

}
