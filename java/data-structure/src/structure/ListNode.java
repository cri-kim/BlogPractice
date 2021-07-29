package structure;

public class ListNode implements LinkedList{
	private int item;
	private ListNode next;
	
	ListNode(int item, ListNode next){
		this.item = item;
		this.next = next;
	}
	
	public ListNode(){}
	public ListNode(int item){ this.item = item; this.next=null;}
	
	@Override
	public ListNode add(ListNode head, ListNode nodeToAdd, int position) {
		ListNode node = head;
		
		if(position == 0) {
			nodeToAdd.next = head;
			return nodeToAdd;
		}
		
		while(position > 0 ) {
			if(node == null) {
				throw new NullPointerException();
			}
			node = node.next;
			position--;
		}
		
		nodeToAdd.next = node.next;
		node.next = nodeToAdd;
		return head;
 	}
	
	@Override
	public ListNode remove(ListNode head, int positionToRemove) {
		ListNode node = head;
		
		if(positionToRemove == 0) {
			return head.getNext();
		}
		
		while(positionToRemove > 0) {
			if(node == null) {
				throw new NullPointerException();
			}
			node = node.next;
			positionToRemove--;
		}
		
		ListNode nodeToDelete = node.next;
		node.next = nodeToDelete.next;
		nodeToDelete.next = null;
		return nodeToDelete;
	}
	
	@Override
	public boolean contains(ListNode head, ListNode nodeToCheck) {
		while(head.next != null) {
			if(head.next == nodeToCheck) {
				return true;
			}
			head = head.next;
		}
		return false;
	}
	
	public int getItem() {
		return this.item;
	}
	public ListNode getNext() {
		return this.next;
	}
	
	public void setNext(ListNode node) {
		this.next = node;
	}
}
