package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode2Test {
    @Test
    void addTwoNumbersTest(){

        LeetCode2 method = new LeetCode2();

        ListNode l1 = new ListNode();
        setListNode(l1, new int[]{2,4,9});
        ListNode l2 = new ListNode();
        setListNode(l2, new int[]{5,6,4,9});
        ListNode root = method.addTwoNumbers(l1.next,l2.next);
        int[] expected = new int[]{7,0,4,0,1};

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
