package hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode347Test {

    @Test
    void topKFrequentTest() {
        Leetcode347 method = new Leetcode347();

        assertEquals(method.topKFrequent(new int[]{1,1,1,2,2,3}, 2)[0]
                , new int[]{1,2}[0]);

    }
}
