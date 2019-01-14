package com.stackroute.pe1testcases;

import com.stackroute.pe1.DigitSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DigitSortTest {
    DigitSort sortNumber;
    @Before
    public void setUp() {
        sortNumber = new DigitSort();
    }

    @After
    public void tearDown()
    {
        sortNumber = null;
    }

    @Test
    public void sortNumberTestSuccess()
    {
        int actualValue = sortNumber.sortDigits(345648);
        int expectedValue = 865443;
        assertEquals(expectedValue ,actualValue );
        boolean actualValue2= sortNumber.calculateSum(0,345648);
        boolean expectedValue2=true;
        assertEquals(actualValue ,expectedValue);
    }

    @Test
    public void sortNumberTestFailure()
    {
        boolean actualValue= sortNumber.calculateSum(0,34564);
        boolean expectedValue=true;
        assertNotEquals(expectedValue,actualValue);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(sortNumber.calculateSum(null,null));
    }
}