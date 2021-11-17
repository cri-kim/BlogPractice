package stack;

import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            Character c1 = stack.peek();
            if(isMatch(c1, s.charAt(i))){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));            
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean isMatch(char c1, char c2){
        if(c1 == '('){
            if(c2 == ')'){
                return true;
            }
        }
        if(c1 == '{'){
            if(c2 == '}'){
                return true;
            }
        }
        if(c1 == '['){
            if(c2 == ']'){
                return true;
            }
        }
        return false;        
    }
}
