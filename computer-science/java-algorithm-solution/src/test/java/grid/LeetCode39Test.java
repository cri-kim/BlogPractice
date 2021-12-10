package grid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode39Test {
    @Test
    void combinationSumTest(){
        LeetCode39 solution = new LeetCode39();
        List<Integer> expected = Arrays.stream(new int[]{2,2,2,2}).boxed().toList();
        assertThat( solution.combinationSum(new int[]{2,3,5}, 8))
                .contains(expected);
    }
}
