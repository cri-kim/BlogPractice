package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode15Test {
    @Test
    void threeSumTest(){
        LeetCode15 method = new LeetCode15();
        assertThat(method.threeSum(new int[]{})).isEmpty();
        assertThat(method.threeSum(new int[]{-1,0,1,2,-1,-4}).get(0)).contains(-1,-1,2);
    }
}
