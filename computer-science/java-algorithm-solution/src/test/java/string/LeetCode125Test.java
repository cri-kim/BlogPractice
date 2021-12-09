package string;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class LeetCode125Test {

    @Test
    void isPalindromeTest(){
        LeetCode125 leetCode125 = new LeetCode125();
        assertThat(leetCode125.isPalindrome("0P")).isFalse();
        assertThat(leetCode125.isPalindrome("race a car")).isFalse();
        assertThat(leetCode125.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }
}