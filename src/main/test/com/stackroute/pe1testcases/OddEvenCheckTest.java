package com.stackroute.pe1;

import com.stackroute.pe1.OddEvenCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckTest {
    OddEvenCheck oddEvenCheck;
    @Before
    public void setUp()  {
        oddEvenCheck = new OddEvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        oddEvenCheck = null;
    }

    @Test
    public void checkOddEvenSuccess() {
        String actualString = oddEvenCheck.checkOddEven(22);
        String expectedString = "Jerry";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void checkOddEvenFailure() {
        String actualString = oddEvenCheck.checkOddEven(23);
        String expectedString = "abc";
        assertNotEquals(actualString,expectedString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(oddEvenCheck.checkOddEven(null));
    }
}