package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode819Test {
    @Test
    void mostCommonWordTest(){
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[]{"hit"};
        LeetCode819 method = new LeetCode819();
        assertEquals(method.mostCommonWord(paragraph, banned), "ball");
        assertEquals(method.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"}), "b");
    }
}
