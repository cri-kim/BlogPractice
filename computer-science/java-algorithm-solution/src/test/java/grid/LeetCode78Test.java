package grid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode78Test {
    @Test
    void subsetsTest(){
        LeetCode78 solution = new LeetCode78();
        List<Integer> expected = Arrays.stream(new int[]{1,2,3}).boxed().toList();
        assertThat(solution.subsets(new int[]{1,2,3}))
                .contains(expected);
    }
}
