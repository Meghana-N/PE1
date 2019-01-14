package com.stackroute.pe1testcases;

import com.stackroute.pe1.IntegerGuess;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerGuessTest {
    IntegerGuess integerGuess;
    @Before
    public void setUp()  {
        integerGuess = new IntegerGuess();
    }

    @After
    public void tearDown() throws Exception {
        integerGuess = null;
    }

    @Test
    public void IntGuessSuccess() {
        String actualString = integerGuess.guessInteger(10,20);
        String expectedString = "Number guessed is less than original number";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void IntGuessFailure() {
        String actualString = integerGuess.guessInteger(60,20);
        String expectedString = "Number guessed is less than original number";
        assertNotEquals(actualString,expectedString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(integerGuess.guessInteger(null,null));
    }
}