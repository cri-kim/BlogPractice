package linkedlist;

public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode rs = head;
        while(head != null){
            if(head.next != null){
                int temp = head.val;
                head.val = head.next.val;
                head.next.val = temp;
                head=head.next.next;
            }else{
                break;
            }
        }
        return rs;
    }
}
