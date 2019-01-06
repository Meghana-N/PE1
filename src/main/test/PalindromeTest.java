import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p1;
    @Before
    public void setUp()  {
        p1 = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        p1 = null;
    }

    @Test
    public void checkPalindrome1Success() {
        String actualStr = p1.checkPalindrome(12321);
        String expectedStr = "Number is palindrome and sum of even numbers is less than 25";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkPalindrome2Success() {
        String actualStr = p1.checkPalindrome(1883881);
        String expectedStr = "Number is palindrome and the sum of even numbers is greater than 25";
        assertEquals(actualStr,expectedStr);
    }

    @Test
    public void checkPalindrome3Success() {
        String actualStr = p1.checkPalindrome(1883);
        String expectedStr = "Number is not palindrome";
        assertEquals(actualStr,expectedStr);
    }
}