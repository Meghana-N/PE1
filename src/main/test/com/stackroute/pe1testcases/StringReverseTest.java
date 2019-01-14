package com.stackroute.pe1testcases;

import com.stackroute.pe1.StringReverse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;
    @Before
    public void setUp()  {
        stringReverse = new StringReverse();
    }

    @After
    public void tearDown() throws Exception {
        stringReverse = null;
    }

    @Test
    public void reverseStringSuccess() {
        String actualString = stringReverse.reverseString("abcd");
        String expectedString = "dcba";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void reverseStringFailure() {
        String actualString = stringReverse.reverseString("bbbaa");
        String expectedString = "bbbaa";
        assertNotEquals(actualString,expectedString);
    }
}