package hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode3Test {
    @Test
    void lengthOfLongestSubstringTest(){
        LeetCode3 method = new LeetCode3();
        assertEquals(3
                , method.lengthOfLongestSubstring("dvdf"));
    }
}
