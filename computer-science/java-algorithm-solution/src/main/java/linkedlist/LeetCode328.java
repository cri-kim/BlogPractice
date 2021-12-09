package linkedlist;

public class LeetCode328 {

    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode rs = new ListNode();
        ListNode odd = new ListNode();
        ListNode even = new ListNode();
        int loc = 1;
        while(head!= null){
            int temp = head.val;
            if(loc % 2 == 1){
                insertListNode(odd,temp);
            }else{
                insertListNode(even,temp);
            }
            head = head.next;
            loc++;
        }
        rs = odd.next;
        while(odd.next != null){
            odd= odd.next;
        }
        odd.next =even.next;

        return rs;
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
}
