package linkedlist;

public class LeetCode21 {
//40분
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode head = root;
        while(!(l1 == null && l2 == null)){
            int v1 = l1 != null ? l1.val : 101;
            int v2 = l2 != null ? l2.val : 101;
            ListNode newNode = new ListNode();
            if(v1 >= v2){
                newNode.val = v2;
                l2 = l2.next;
            }else{
                newNode.val = v1;
                l1 = l1.next;
            }
            root.next = newNode;
            root = root.next;
        }
        return head.next;
    }
}
