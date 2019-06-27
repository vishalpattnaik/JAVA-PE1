package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {


    ReverseString ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new ReverseString();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void reverseAString() {

       String result = ob.stringReverse("london");
       assertEquals("nodnol", result);

    }

    @Test
    public void reverseStringFailed() {

        String result = ob.stringReverse("hello");
        assertEquals("ollhe", result);

    }
}