package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIntegerTest {

    StringInteger ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new StringInteger();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkStringInteger() {

        String result = ob.repeatString("Stackroute", 5);
        assertEquals("Stackrouterouterouterouterouteroute", result);

    }

    @Test
    public void checkStringIntegerFail() {

        String result = ob.repeatString("Stackroute", 8);
        assertEquals("Stackrouterouterouterouterouteroute", result);

    }

}