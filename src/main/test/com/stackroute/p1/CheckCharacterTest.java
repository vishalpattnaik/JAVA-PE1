package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCharacterTest {

    CheckCharacter ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new CheckCharacter();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkCapitalLetter() {

        String result = ob.checkCharacter('A');
        assertEquals("Capital Letter", result);

    }

    @Test
    public void checkSmallLetter() {

        String result = ob.checkCharacter('b');
        assertEquals("Small case Letter", result);

    }

    @Test
    public void checkDigit() {

        String result = ob.checkCharacter('6');
        assertEquals("Digit", result);

    }

    @Test
    public void checkSpecialCharacter() {

        String result = ob.checkCharacter('&');
        assertEquals("Special symbol", result);

    }


}