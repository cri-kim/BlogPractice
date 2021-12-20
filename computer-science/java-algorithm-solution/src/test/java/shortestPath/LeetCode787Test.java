package shortestPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode787Test {
    @Test
    void findCheapestPriceTest(){
        LeetCode787 solution = new LeetCode787();
        int[][] flights = new int[][]{{0,1,100},{1,2,100},{0,2,500}};
        assertEquals(200, solution.findCheapestPrice(3, flights, 0,2,1));
    }
}
