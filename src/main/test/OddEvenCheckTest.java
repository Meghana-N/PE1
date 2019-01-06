import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckTest {
    OddEvenCheck c1;
    @Before
    public void setUp()  {
        c1 = new OddEvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        c1 = null;
    }

    @Test
    public void checkOddEven1Success() {
        String actualStr = c1.checkOddEven(22);
        String expectedStr = "Jerry";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkOddEven2Success() {
        String actualStr = c1.checkOddEven(23);
        String expectedStr = "Tom";
        assertEquals(actualStr,expectedStr);
    }
}