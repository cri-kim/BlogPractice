package string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode937Test {
    @Test
    void reorderLogFilesTest(){
        String[] defaultArray = new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        LeetCode937 method = new LeetCode937();
        String[] expectedArray = method.reorderLogFiles(defaultArray);
        assertEquals(expectedArray[0],"let1 art can");
    }
}
