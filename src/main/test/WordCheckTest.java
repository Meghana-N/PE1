import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordCheckTest {
    WordCheck w1;
    @Before
    public void setUp()  {
        w1 = new WordCheck();
    }

    @After
    public void tearDown() throws Exception {
        w1 = null;
    }

    @Test
    public void checkWord1Success() {
        String actualStr = w1.checkWord("e");
        String expectedStr = "Vowel ";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkWord2Success() {
        String actualStr = w1.checkWord("B");
        String expectedStr = "Consonant ";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkWord3Success() {
        String actualStr = w1.checkWord("Hu");
        String expectedStr = "Consonant Vowel ";
        assertEquals(actualStr,expectedStr);
    }
}