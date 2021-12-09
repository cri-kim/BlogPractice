package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode561Test {
    @Test
    void arrayPairSumTest(){
        LeetCode561 method = new LeetCode561();
        assertEquals(4, method.arrayPairSum(new int[]{1,4,3,2}));
    }
}
