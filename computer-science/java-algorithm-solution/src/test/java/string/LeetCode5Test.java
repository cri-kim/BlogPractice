package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode5Test {
    @Test
    void longestPalindromeTest(){
        LeetCode5 method = new LeetCode5();
        assertEquals("bab", method.longestPalindrome("babad"));
        assertEquals("bb",method.longestPalindrome("cbbd"));
        assertEquals("cc",method.longestPalindrome("ccd"));
    }

    @Test
    void isPalindromeTest(){
        LeetCode5 method = new LeetCode5();
        assertEquals(method.isPalindrome("ada"),true);
        assertEquals(method.isPalindrome("adac"),false);
    }
}
