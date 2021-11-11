package linkedlist;

public class LeetCode2 {
    private static final int ASCII_NUMBER_START = 48;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;
        StringBuilder rs = new StringBuilder();

        while(l1 != null || l2 != null){
            int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val);
            sum += rem;
            rem = sum/10;
            rs.append(sum%10);
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
        if(rem > 0){
            rs.append(rem);
        }
        ListNode reveredNode = new ListNode();
        for(int i=0;i<rs.length();i++){
            insertListNode(reveredNode, (int)rs.charAt(i) - ASCII_NUMBER_START);
        }
        return reveredNode.next;
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
