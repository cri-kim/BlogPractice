package hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode771Test {
    @Test
    void numJewelsInStonesTest(){
        LeetCode771 method = new LeetCode771();
        assertEquals(3, method.numJewelsInStones("aA","aAAbbbb"));
    }
}
