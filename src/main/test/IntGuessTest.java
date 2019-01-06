import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntGuessTest {
    IntGuess obj;
    @Before
    public void setUp()  {
        obj = new IntGuess();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void IntGuess1Success() {
        String actualStr = obj.guessInt(10,20);
        String expectedStr = "Number guessed is less than original number";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void IntGuess2Success() {
        String actualStr = obj.guessInt(30,20);
        String expectedStr = "Number guessed is more than original number";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void IntGuess3Success() {
        String actualStr = obj.guessInt(20,20);
        String expectedStr = "Number guessed matches the original number";
        assertEquals(actualStr,expectedStr);
    }
}