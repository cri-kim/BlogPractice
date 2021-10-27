package string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode344Test {

    @Test
    public void reverseStringTest() {
        LeetCode344 let = new LeetCode344();
        char[] s = new char[]{'h','e','l','l','o'};
        let.reverseString(s);
        assertEquals(s[0], 'o');
    }
}
