package grid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode200Test {
    @Test
        void numIslandsTest() {
            LeetCode200 method = new LeetCode200();
            char [][] grid = { {'1','1','1','1','0'},  {'1','1','0','1','0'},
                                {'1','1','0','0','0'},{'0','0','0','0','0'}};
            assertEquals(1, method.numIslands(grid));
        }
}
