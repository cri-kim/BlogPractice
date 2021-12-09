package linkedlist;

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode reveredNode = null;
        while(head != null){
            ListNode newNode = new ListNode(head.val, reveredNode);
            reveredNode = newNode;
            head = head.next;
        }
        return reveredNode;
    }
}
