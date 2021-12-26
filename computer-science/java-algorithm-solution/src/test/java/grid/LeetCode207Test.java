package grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode207Test {
    @Test
    void canFinishTest(){
        LeetCode207 solution = new LeetCode207();
        assertEquals(true
                , solution.canFinish(2, new int[][]{{1,0}}));
    }
}
