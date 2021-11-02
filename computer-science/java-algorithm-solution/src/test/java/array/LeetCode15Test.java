package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode15Test {
    @Test
    void threeSumTest(){
        LeetCode15 method = new LeetCode15();
        assertThat(method.threeSum(new int[]{})).isEmpty();
    }
}
