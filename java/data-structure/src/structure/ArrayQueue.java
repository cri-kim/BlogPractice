package structure;

public class ArrayQueue implements Queue{
	int[] items;
	int head;
	int tail;
	
	ArrayQueue(int size){
		this.items = new int[size];
		this.head = -1;
		this.tail = -1;
	}
	
	@Override
	public void offer(int item) {
		items[++tail] = item;
	}

	@Override
	public int poll() {
		return items[++head];
	}

	@Override
	public boolean isEmpty() {
		if(head == tail) {
			return true;
		}
		return false;
	}

}
