package grid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode332Test {
    @Test
    void findItineraryTest(){
        LeetCode332 solution = new LeetCode332();
        assertEquals(Arrays.asList(new String[]{"JFK","MUC","LHR","SFO","SJC"})
                ,solution.findItinerary(Arrays.asList(
                        Arrays.asList(new String[]{"MUC","LHR"}),
                        Arrays.asList(new String[]{"JFK","MUC"}),
                        Arrays.asList(new String[]{"SFO","SJC"}),
                        Arrays.asList(new String[]{"LHR","SFO"})
                )));

    }
}
//[GIT]경력용 사전 체크리스트 2021