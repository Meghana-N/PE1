import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordRepeatTest {
    WordRepeat obj;
    @Before
    public void setUp()  {
        obj = new WordRepeat();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void repeatWord1Success() {
        String actualStr = obj.repeatWord("StackRoute",2);
        String expectedStr = "StackRoutetete";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void repeatWord2Success() {
        String actualStr = obj.repeatWord("Java",3);
        String expectedStr = "Javaavaavaava";
        assertEquals(actualStr,expectedStr);
    }
}