package string;

public class LeetCode125 {
    public boolean isPalindrome(String s) {
        String defaultString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuffer sb = new StringBuffer(defaultString).reverse();

        return defaultString.equals(sb.toString());
    }
}
