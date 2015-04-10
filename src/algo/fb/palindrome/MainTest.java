package algo.fb.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Main.isPalindrome("ABCCBA"));
        assertFalse(Main.isPalindrome("ADCCBA"));
        assertFalse(Main.isPalindrome("A^&@&^@D#@$*C&^@C#(*(*#(*B&#&^#^&#&^A"));

        assertTrue(Main.isPalindrome("A!!!A"));
        assertTrue(Main.isPalindrome("A!!!!!&^#^&"));
        assertTrue(Main.isPalindrome("#^^#&#*"));
        assertTrue(Main.isPalindrome("AA!!!!!!!"));
        assertTrue(Main.isPalindrome("!!!!!!!AA"));
        assertTrue(Main.isPalindrome("A^^&#&*@*"));
        assertTrue(Main.isPalindrome("^^&#&*@*A"));

        assertTrue(Main.isPalindrome("ABA"));
        assertTrue(Main.isPalindrome("A$^B&^&&&A"));
        assertTrue(Main.isPalindrome("^&^^&&^ZA^^@(*@(@(AZ^&@^@*@*"));
    }

}
