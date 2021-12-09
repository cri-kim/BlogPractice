package array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode1Test {
    @Test
    void twoSum(){
        LeetCode1 method= new LeetCode1();
        assertThat(method
                .twoSum(new int[]{2,7,11,15}, 9))
        .contains(0);
    }
}
