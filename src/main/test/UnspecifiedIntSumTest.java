import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class UnspecifiedIntSumTest {
    @Test
    public void calculateSumSuccess()
    {
        UnspecifiedIntSum unspecSum= new UnspecifiedIntSum();
        int expectedValue = 15;
        ArrayList<Integer> list=new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int actualValue=unspecSum.calculateSum(list,0);
        assertEquals(expectedValue,actualValue);
    }

}