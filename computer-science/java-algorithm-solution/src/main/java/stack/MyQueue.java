package stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack;
    int firstElement;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            firstElement = x;
        }
        stack.push(x);
    }

    public int pop() {
        Stack<Integer> temp = new Stack<>();
        while(stack.size()>1){
            temp.push(stack.pop());
        }
        int rs = stack.pop();
        while(!temp.isEmpty()){
            push(temp.pop());
        }
        return rs;
    }

    public int peek() {
        return firstElement;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
