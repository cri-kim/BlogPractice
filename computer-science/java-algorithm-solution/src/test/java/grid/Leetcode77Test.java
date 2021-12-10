package grid;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leetcode77Test {
    @Test
    void backtrackingTest(){
        LeetCode77 solution = new LeetCode77();
        List<Integer> expected = Arrays.stream(new int[]{2,4}).boxed().toList();
        assertThat(solution.combine(4,2)).contains(expected);
    }
}
