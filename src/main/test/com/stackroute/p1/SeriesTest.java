package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesTest {

    Series ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new Series();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkSeries() {

        String result = ob.printSeries(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ", result);

    }
}