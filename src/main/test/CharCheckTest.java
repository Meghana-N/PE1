import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCheckTest {
    CharCheck obj;
    @Before
    public void setUp()  {
        obj = new CharCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void checkChar1Success() {
        String actualStr = obj.checkChar("a");
        String expectedStr = "Lower case letter";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkChar2Success() {
        String actualStr = obj.checkChar("Z");
        String expectedStr = "Capital letter";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkChar3Success() {
        String actualStr = obj.checkChar("4");
        String expectedStr = "Digit";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkChar4Success() {
        String actualStr = obj.checkChar("!");
        String expectedStr = "Special Character";
        assertEquals(actualStr,expectedStr);
    }
}