package com.stackroute.pe1testcases;

import com.stackroute.pe1.CharacterCheck;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCheckTest {
    CharacterCheck characterCheck;
    @Before
    public void setUp()  {
        characterCheck = new CharacterCheck();
    }

    @After
    public void tearDown() throws Exception {
        characterCheck = null;
    }

    @Test
    public void checkChar1Success() {
        String actualString = characterCheck.checkCharacter("a");
        String expectedString = "Lower case letter";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void checkChar2Success() {
        String actualString = characterCheck.checkCharacter("Z");
        String expectedString = "Capital letter";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void checkChar3Success() {
        String actualString = characterCheck.checkCharacter("4");
        String expectedString = "Digit";
        assertEquals(actualString,expectedString);
    }

    @Test
    public void checkCharFailure() {
        String actualString = characterCheck.checkCharacter("123");
        String expectedString = "Special Character";
        assertNotEquals(actualString,expectedString);
    }

    @Test(expected = NullPointerException.class)
    public void testInvalidCase() {
        assertNull(characterCheck.checkCharacter(null));
    }
}