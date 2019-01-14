package com.stackroute.pe1testcases;

import com.stackroute.pe1.WordRepeat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordRepeatTest {
    WordRepeat wordRepeat;
    @Before
    public void setUp()  {
        wordRepeat = new WordRepeat();
    }

    @After
    public void tearDown() throws Exception {
        wordRepeat = null;
    }

    @Test
    public void repeatWordSuccess() {
        String actualString = wordRepeat.repeatWord("StackRoute",2);
        String expectedString = "StackRoutetete";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void repeatWordFailure() {
        String actualString = wordRepeat.repeatWord("Java",3);
        String expectedString = "vaavaavaava";
        assertNotEquals(actualString,expectedString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(wordRepeat.repeatWord(null,null));
    }
}