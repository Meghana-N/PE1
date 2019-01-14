package com.stackroute.pe1testcases;

import com.stackroute.pe1.PatternDisplay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternDisplayTest {
    PatternDisplay patternDisplay;
    @Before
    public void setUp()  {
        patternDisplay = new PatternDisplay();
    }

    @After
    public void tearDown() throws Exception {
        patternDisplay = null;
    }

    @Test
    public void printPatternSuccess() {
        String actualOutput = patternDisplay.printPattern(4);
        String expectedOutput = "1223334444";
        assertEquals(actualOutput,expectedOutput);
    }

    @Test
    public void printPatternFailure() {
        String actualOutput = patternDisplay.printPattern(2);
        String expectedOutput = "1227";
        assertNotEquals(actualOutput,expectedOutput);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(patternDisplay.printPattern(null));
    }
}