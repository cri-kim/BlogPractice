package shortestPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode743Test {
    @Test
    void networkDelayTimeTest(){
        LeetCode743 solution = new LeetCode743();
        int expected = 2;
        assertEquals(expected, solution.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2));
    }
}
