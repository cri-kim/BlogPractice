package stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> queue;
    int lastElement;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        lastElement=x;
    }

    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        while(queue.size()>1){
            lastElement = queue.remove();
            temp.add(lastElement);
        }
        int rs = queue.remove();
        for(int e : temp){
            queue.add(e);
        }
        return rs;
    }

    public int top() {
        return lastElement;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
