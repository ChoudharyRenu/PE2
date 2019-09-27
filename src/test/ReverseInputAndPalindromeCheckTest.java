import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.String;

public class ReverseInputAndPalindromeCheckTest {

    private ReverseInputAndPalindromeCheck reverseInputAndPalindromeCheck=new ReverseInputAndPalindromeCheck();

    @Test
    public void palindrome() {
        String s="12321";
        String result=reverseInputAndPalindromeCheck.reverseInputAndPalindromeCheck(s);
        //System.out.println("Result" + result);
        assertNotNull(result);
        assertEquals("success",result);
    }

    @Test
    public void notPalindrome() {
        String s="12345";
        String result=reverseInputAndPalindromeCheck.reverseInputAndPalindromeCheck(s);
        assertNotNull(result);
        assertNotEquals("palindrome",result);
    }
}