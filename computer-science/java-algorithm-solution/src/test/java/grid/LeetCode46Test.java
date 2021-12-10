package grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode46Test {
    @Test
    void permute(){
        Leetcode46 solution = new Leetcode46();
        assertEquals(1, solution.permute(new int[]{0,1}).get(0).get(1));
    }
}
