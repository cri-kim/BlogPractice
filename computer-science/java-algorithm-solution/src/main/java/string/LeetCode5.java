package string;

public class LeetCode5 {
    public String longestPalindrome(String s) {
        if(s.length() < 2 || isPalindrome(s)){
            return s;
        }
        String rs = "";
        for(int i=0;i<s.length() -1;i++){
            String ex1 = expand(i,i+1,s);
            String ex2 = expand(i,i+2,s);
            if(ex1.length() > ex2.length()){
                if(ex1.length() > rs.length()){
                    rs = ex1;
                }
            }
            else{
                if(ex2.length() > rs.length()){
                    rs = ex2;
                }
            }
        }
        return rs;
    }
    public String expand(int left, int right, String s){
        while(left >= 0 && right< s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }

    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString().equals(s);
    }
}
