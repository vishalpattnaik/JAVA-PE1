package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {

    GuessTheNumber ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new GuessTheNumber();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void guessNumber() {

        String result = ob.guessTheNumber(58);
        assertEquals("Number guessed matches the original number", result);

    }
}