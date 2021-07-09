package structure;

public class ArrayStack implements Stack{
	int[] items;
	int top = -1;
	
	ArrayStack(int size){
		this.items = new int[size];
		this.top = -1;
	}

	@Override
	public void push(int item) {
		items[++top] = item;
	}

	@Override
	public int pop() {
		if(isEmpty()) {
			return top;
		}
		return items[top--];
	}

	@Override
	public boolean isEmpty() {
		if(top == -1) {return true;}
		return false;
	}
}
