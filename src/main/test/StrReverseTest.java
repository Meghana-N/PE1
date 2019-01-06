import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrReverseTest {
    StrReverse obj;
    @Before
    public void setUp()  {
        obj = new StrReverse();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void revStr1Success() {
        String actualStr = obj.revStr("abcd");
        String expectedStr = "dcba";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void revStr2Success() {
        String actualStr = obj.revStr("bbbaa");
        String expectedStr = "bbbaa";
        assertNotEquals(actualStr,expectedStr);
    }
}