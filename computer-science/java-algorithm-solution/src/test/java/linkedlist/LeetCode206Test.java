package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode206Test {
    @Test
    void reverseListTest(){
        LeetCode206 method = new LeetCode206();

        ListNode head = new ListNode();
        setListNode(head, new int[]{1,2,3,4,5});
        ListNode root = method.reverseList(head);
        int[] expected = new int[]{5,4,3,2,1};

        for(int i=0;i<expected.length;i++){
            assertEquals(root.val, expected[i]);
            root = root.next;
        }
    }
    private void setListNode(ListNode root, int[] arr){
        for(int i=0 ; i < arr.length ; i++){
            insertListNode(root, arr[i]);
        }
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
