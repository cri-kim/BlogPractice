package structure;

import java.util.Queue;

public class ListNodeStack implements Stack{
	ListNode items;
	int top = -1;

	@Override
	public void push(int item) {
		if(isEmpty()) {
			items = new ListNode(item);
			top++;
		}
		else {
			ListNode nodeToAdd = new ListNode(item);
			items = items.add(items, nodeToAdd, top+1);
		}
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return top;
		}
		else {
			ListNode nodeToDelete = items.remove(items, top+1);
			top--;
			return nodeToDelete.getItem();
		}
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {return true;}
		return false;
	}

}
