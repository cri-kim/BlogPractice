package grid;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode17Test {

    @Test
    void letterCombinationsTest(){
        LeetCode17 solution = new LeetCode17();
        List<String> expected = Arrays.asList(new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"});
        assertEquals(expected.get(0), solution.letterCombinations("23").get(0));
    }
}
