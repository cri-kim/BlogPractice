package grid;

import java.util.*;
//못품
public class LeetCode17 {
    public static List<String> result;
    public static String[] phone;
    public List<String> letterCombinations(String digits) {
        result = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        phone = new String[]{"",""
                ,"abc","def","ghi","jki","mno","pqrs","tuv","wxyz"};
        if(digits.length() > 0){
            dfs(0, new StringBuilder(), digits.toCharArray());
        }
        return result;
    }

    public void dfs(int pick, StringBuilder sb, char[] chars){
        if(pick == chars.length){
            result.add(sb.toString());
            return;
        }

        char[] charArr = phone[Character.getNumericValue(chars[pick])].toCharArray();

        for(int i=0;i<charArr.length;i++){
            sb.append(charArr[i]);
            dfs(pick+1, sb, chars);
            sb.delete(sb.length() - 1, sb.length());
        }
    }

}
