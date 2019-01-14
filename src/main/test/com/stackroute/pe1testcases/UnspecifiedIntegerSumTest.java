package com.stackroute.pe1testcases;

import com.stackroute.pe1.UnspecifiedIntegerSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class UnspecifiedIntegerSumTest {
    UnspecifiedIntegerSum unspecifiedIntegerSum;
    @Before
    public void setUp()  {
        unspecifiedIntegerSum = new UnspecifiedIntegerSum();
    }

    @After
    public void tearDown() throws Exception {
        unspecifiedIntegerSum = null;
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(unspecifiedIntegerSum.calculateSum(null,null));
    }
    
    @Test
    public void calculateSumSuccess()
    {
        int expectedValue = 15;
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int actualValue = unspecifiedIntegerSum.calculateSum(list,0);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void calculateSumFailure()
    {
        int expectedValue = 15;
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int actualValue = unspecifiedIntegerSum.calculateSum(list,0);
        assertNotEquals(expectedValue,actualValue);
    }

}