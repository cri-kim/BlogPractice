package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode238Test {
    @Test
    void productExceptSelfTest(){
        LeetCode238 method = new LeetCode238();
        int[] output = new int[]{24,12,8,6};
        assertEquals(output[0],
                method.productExceptSelf(new int[]{1,2,3,4})[0]);
    }
}
