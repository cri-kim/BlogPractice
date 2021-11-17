package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode316Test {

    @Test
    public void removeDuplicateLettersTest() {
        LeetCode316 method = new LeetCode316();
        String expected="acdb";
        String actual = method.removeDuplicateLetters("cbacdcbc");
        assertEquals(expected, actual);
        assertEquals("abc", method.removeDuplicateLetters("abacb"));
    }

}
