package hashmap;

import java.util.HashSet;
import java.util.Set;

public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        String max = "";
        int start = 0;
        for(int end=1;end < n+1;end++){
            String s1 = s.substring(start,end);
            if(hasRepeatingCharacters(s1)){
                start++;
                end--;
                continue;
            }
            if(max.length() < s1.length()){
                max = s1;
            }
        }
        return max.length();
    }
    public boolean hasRepeatingCharacters(String s){
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch:chars){
            if(set.contains(ch)){
                return true;
            }
            set.add(ch);
        }
        return false;
    }
}
