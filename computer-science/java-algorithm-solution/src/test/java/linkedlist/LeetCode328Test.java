package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode328Test {
    @Test
    void oddEvenListTest(){
        LeetCode328 method = new LeetCode328();

        ListNode head = new ListNode();
        setListNode(head, new int[]{1,2,3,4,5});
        ListNode root = method.oddEvenList(head.next);
        int[] expected = new int[]{1,3,5,2,4};
        for(int i=0;i<expected.length;i++){
            assertEquals(expected[i], root.val);
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
