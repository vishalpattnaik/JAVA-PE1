package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    @Test
    public void givenIntegerIsPalindromeAndSumOfDigitsIsGreaterThanReturnMessage() {

        String result = ob.checkPalindrome(2468642);
        assertEquals("2468642 is palindrome and sum of even numbers is greater than 25.",result);


    }

    @Test
    public void givenIntegerIsPalindromeAndSumOfDigitsIsLessThanReturnMessage() {

        String result = ob.checkPalindrome(12221);
        assertEquals("12221 is palindrome and sum of even numbers is less than 25.",result);

    }

    @Test
    public void givenIntegerNotPalindromeReturnMessage() {

        String result = ob.checkPalindrome(2432);
        assertEquals("2432 is not palindrome.", result);


    }
}