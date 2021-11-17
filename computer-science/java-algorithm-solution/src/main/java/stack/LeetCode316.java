package stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LeetCode316 {

    public String removeDuplicateLetters(String s) {
        Set<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        int n  = s.length();
        for(int i=0;i<n;i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                set.add(s.charAt(i));
                continue;
            }

            while(!stack.isEmpty()) {
                char temp = stack.peek();
                if (temp > s.charAt(i)) {
                    if(set.contains(s.charAt(i))){
                        break;
                    }
                    if (hasLetterBack(s, i, temp)) {
                        char pop = stack.pop();
                        set.remove(pop);
                        continue;
                    }
                }
                break;
            }
           if(set.contains(s.charAt(i))){
                continue;
            }
            stack.push(s.charAt(i));
            set.add(s.charAt(i));
        }
        Character[] arr = new Character[stack.size()];
        arr = stack.toArray(arr);
        StringBuilder sb = new StringBuilder();
        for(Character c : arr){
            sb.append(c);
        }

        return sb.toString();
    }

    public boolean hasLetterBack(String s, int idx, char temp){
        return s.substring(idx).contains(String.valueOf(temp));
    }
}
