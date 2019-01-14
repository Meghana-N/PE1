package com.stackroute.pe1testcases;

import com.stackroute.pe1.PalindromeCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck palindromeCheck;
    @Before
    public void setUp()  {
        palindromeCheck = new PalindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
        palindromeCheck = null;
    }

    @Test
    public void checkPalindrome1Success() {
        String actualString = palindromeCheck.checkPalindrome((long) 12321);
        String expectedString = "Number is palindrome and sum of even numbers is less than 25";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void checkPalindrome3Failure() {
        String actualString = palindromeCheck.checkPalindrome((long) 1883);
        String expectedString = "Number is palindrome";
        assertNotEquals(actualString,expectedString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(palindromeCheck.checkPalindrome(null));
    }
}