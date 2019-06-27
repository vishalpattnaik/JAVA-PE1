package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckIntegerTest{
    CheckInteger ob;
    @Before
    public void setUp() throws Exception {
        ob=new CheckInteger();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void checkNumFound()
    {
        String result=ob.integerCheck("12 23 2 4");
        assertEquals("sum 41",result);
    }
    @Test
    public void checkSpecialCharFound()
    {
        String result=ob.integerCheck("1 62 3 34 5 a");
        assertEquals("character found",result);
    }
    @Test
    public void checkNumFound2()
    {
        String result=ob.integerCheck("76 8 2 98");
        assertEquals("sum 184",result);
    }
}