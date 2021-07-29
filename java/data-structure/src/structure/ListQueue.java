package structure;

public class ListQueue implements Queue{

	ListNode node;
	ListNode head;
	
	@Override
	public void offer(int item) {
		ListNode nodeToAdd = new ListNode(item);
		if(isEmpty()) {
			node = nodeToAdd;
		}
		else {
			ListNode nextNode = node;
			while(nextNode.getNext() != null) {
				nextNode = nextNode.getNext();
			}
			nextNode.setNext(nodeToAdd);
		}
	}

	@Override
	public int poll() {
		if(isEmpty()) {
			return -1;
		}
		int value = head.getItem();
		ListNode nextNode = head.getNext();
		head = null;
		head = nextNode;
		return value;
	}

	@Override
	public boolean isEmpty() {
		if(head.getNext() == null) {
			return true;
		}
		return false;
	}

}
