package queue;

import linkedlist.ListNode;

import java.util.PriorityQueue;

public class LeetCode23 {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0)
            return null;

        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            addListNodeToQueue(temp);
        }
        return asListNode();
    }

    public ListNode asListNode(){
        ListNode newListNode = new ListNode();

        while(!queue.isEmpty()){
            int value = queue.poll();
            insertListNode(newListNode, value);
        }
        return newListNode.next;
    }
    private void insertListNode(ListNode root, int i){
        ListNode newNode = new ListNode(i);
        if(root == null){
            root = newNode;
        }
        else{
            ListNode temp = root;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addListNodeToQueue(ListNode node){
        while(node != null){
            queue.add(node.val);
            node = node.next;
        }
    }
}
