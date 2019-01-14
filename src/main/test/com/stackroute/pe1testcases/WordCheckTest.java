package com.stackroute.pe1testcases;

import com.stackroute.pe1.WordCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckTest {
    WordCheck wordCheck;
    @Before
    public void setUp()  {
        wordCheck = new WordCheck();
    }

    @After
    public void tearDown() throws Exception {
        wordCheck = null;
    }

    @Test
    public void checkWordSuccess() {
        String actualString = wordCheck.checkWord("e");
        String expectedString = "Vowel ";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void checkWordFailure() {
        String actualString = wordCheck.checkWord("i");
        String expectedString = "Consonant ";
        assertNotEquals(actualString,expectedString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordCheck.checkWord(null));
    }
}