import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternDisplayTest {
    PatternDisplay obj;
    @Before
    public void setUp()  {
        obj = new PatternDisplay();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void printPattern1Success() {
        String actualStr = obj.printPattern(4);
        String expectedStr = "1223334444";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void printPattern2Success() {
        String actualStr = obj.printPattern(2);
        String expectedStr = "122";
        assertEquals(actualStr,expectedStr);
    }
}