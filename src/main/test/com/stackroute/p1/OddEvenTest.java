package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenTest {

    OddEven ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new OddEven();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkLimit() {

       String result = ob.checkOddEven(56);
        assertEquals("Number doesn't exists between 20 and 30", result);

    }

    @Test
    public void checkEven() {

        String result = ob.checkOddEven(26);
        assertEquals("Jerry", result);

    }

    @Test
    public void checkOdd() {

        String result = ob.checkOddEven(21);
        assertEquals("Tom", result);

    }

    @Test
    public void checkCharacter() {

        String result = ob.checkOddEven('a');
        assertEquals("Please enter a number", result);

    }


}