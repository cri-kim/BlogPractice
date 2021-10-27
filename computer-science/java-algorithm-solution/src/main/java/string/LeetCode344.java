package string;


public class LeetCode344 {

    public void reverseString(char[] s) {
        int len = s.length;
        if(len == 0) return;
        for (int i=0; i < (len/2); i++)
        {
            char l = s[i];
            s[i] = s[len-i-1];
            s[len-i-1] = l;
        }
    }
}
