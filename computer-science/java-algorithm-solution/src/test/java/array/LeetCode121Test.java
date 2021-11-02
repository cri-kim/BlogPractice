package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode121Test {
    @Test
    void maxProfitTest(){
        LeetCode121 method = new LeetCode121();
        assertEquals(5,
                method.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
