package stack;

public class MyCircularQueue {
    private class ListNode{
        ListNode next;
        int val;
        ListNode(){

        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
        ListNode(int val){
            this.val=val;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int size;
    private int len;

    public MyCircularQueue(int k) {
        head=tail=null;
        size=k;
        len=0;
    }

    public boolean enQueue(int value) {
        if(len==size){
            return false;
        }
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=tail=newNode;
            newNode.next=head;
        }
        else{
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
        }
        len++;
        return true;
    }

    public boolean deQueue() {
        if(len==0){
            return false;
        }
        if(len==1){
            head=tail=null;
        }
        else{
            head=head.next;
        }
        len--;
        return true;
    }

    public int Front() {
        if(head==null){
            return -1;
        }
        return head.val;
    }

    public int Rear() {
        if(tail==null){
            return -1;
        }
        return tail.val;
    }

    public boolean isEmpty() {
        return len==0;
    }

    public boolean isFull() {
        return size==len;
    }
}
