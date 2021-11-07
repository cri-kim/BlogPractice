package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode42Test {
    @Test
    void trapTest(){
        LeetCode42 method = new LeetCode42();
        int[] input = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int output = 6;
       assertEquals(output, method.trap(input));
    }
    @Test
    void trap2Test(){
        LeetCode42 method = new LeetCode42();
        int[] input = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int output = 6;
        assertEquals(output, method.trap2(input));
    }
}
