package challenge.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsPalindromeTest {

    @Test
    public void isPalindrome_True() {
        String twoCharText = "aa"; // even
        String evenLengthText = "homeemoh"; // even
        String oddLengthText = "homenemoh"; // odd
        String emptyText = "";
        String nullText = null;

        assertTrue(IsPalindrome.recursiveCheck(twoCharText));
        assertTrue(IsPalindrome.recursiveCheck(evenLengthText));
        assertTrue(IsPalindrome.recursiveCheck(oddLengthText));
        assertTrue(IsPalindrome.recursiveCheck(emptyText));
        assertTrue(IsPalindrome.recursiveCheck(nullText));

        assertTrue(IsPalindrome.check(twoCharText));
        assertTrue(IsPalindrome.check(evenLengthText));
        assertTrue(IsPalindrome.check(oddLengthText));
        assertTrue(IsPalindrome.check(emptyText));
        assertTrue(IsPalindrome.check(nullText));
    }

    @Test
    public void isPalindrome_False() {
        String twoCharText = "ab"; // even
        String evenLengthText = "homeamoh"; // even
        String oddLengthText = "homenamoh"; // odd

        assertFalse(IsPalindrome.recursiveCheck(twoCharText));
        assertFalse(IsPalindrome.recursiveCheck(evenLengthText));
        assertFalse(IsPalindrome.recursiveCheck(oddLengthText));

        assertFalse(IsPalindrome.check(twoCharText));
        assertFalse(IsPalindrome.check(evenLengthText));
        assertFalse(IsPalindrome.check(oddLengthText));
    }
}
