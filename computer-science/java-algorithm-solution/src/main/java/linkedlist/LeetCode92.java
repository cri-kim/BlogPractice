package linkedlist;


public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        int size = getListNodeSize(head);
        ListNode prev = splitListNode(head,1,left-1);
        ListNode mid = reverseList(splitListNode(head, left,right));
        ListNode aft = splitListNode(head, right+1, size);

        ListNode rs = mergeTwoLists(prev,mergeTwoLists(mid,aft));

        return rs;
    }

    public ListNode splitListNode(ListNode head, int start, int end) {
        ListNode newNode = new ListNode();
        ListNode rs = newNode;
        int cur = 1;
        while(head != null || cur < end){
            if(cur >= start && cur<=end){
                insertListNode(newNode, head.val);
            }
            head = head.next;
            cur++;
        }
        return rs.next;
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

    public int getListNodeSize(ListNode root) {
        int count = 0;
        while(root != null){
            root = root.next;
            count++;
        }
        return count;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode head = root;
        while(l1 != null){
            ListNode newNode = new ListNode(l1.val);
            l1 = l1.next;
            root.next = newNode;
            root = root.next;
        }
        while(l2 != null){
            ListNode newNode = new ListNode(l2.val);
            l2 = l2.next;
            root.next = newNode;
            root = root.next;
        }
        return head.next;
    }
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
