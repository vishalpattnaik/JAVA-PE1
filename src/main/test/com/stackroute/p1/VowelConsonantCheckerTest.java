package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantCheckerTest {

    VowelConsonantChecker ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new VowelConsonantChecker();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void checkVowelForSingleLetter() {

        String result = ob.checkVowelConsonant("e");
        assertEquals("Vowel ", result);

    }

    @Test
    public void checkConsonantForSingleLetter() {

        String result = ob.checkVowelConsonant("t");
        assertEquals("Consonant ", result);

    }

    @Test
    public void checkVowelConsonantForWord() {

        String result = ob.checkVowelConsonant("ap");
        assertEquals("Vowel Consonant ", result);

    }


    @Test
    public void checkLetter() {

        String result = ob.checkVowelConsonant("45");
        assertEquals("Input is not a letter", result);

    }

}