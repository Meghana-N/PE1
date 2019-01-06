import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class SortNumTest {

    SortNum sortNum;
    @Before
    public void setUp() {
        sortNum = new SortNum();
    }

    @After
    public void tearDown()
    {
        sortNum =null;
    }

    @Test
    public void sortNumTestSuccess()
    {
        int actualValue1= sortNum.sortDigits(345648);
        int expectedValue1=865443;
        assertEquals(expectedValue1,actualValue1);

        boolean actualValue2= sortNum.calculateSum(0,345648);
        boolean expectedValue2=true;
        assertEquals(actualValue2,expectedValue2);
    }

    @Test
    public void sortNumTestFailure()
    {
        boolean actualValue= sortNum.calculateSum(0,34564);
        boolean expectedValue=false;
        assertEquals(expectedValue,actualValue);
    }
}