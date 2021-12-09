package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode92Test {
    @Test
    void reverseBetweenTest(){
        LeetCode92 method = new LeetCode92();
        ListNode head = new ListNode();
        setListNode(head, new int[]{1,2,3,4,5});
        ListNode root = method.reverseBetween(head.next, 2,4);
        int[] expected = new int[]{1,4,3,2,5};
        for(int i=0;i<expected.length;i++){
            assertEquals(expected[i], root.val);
            root = root.next;
        }
    }

    @Test
    void splitListNodeTest(){
        LeetCode92 method = new LeetCode92();
        ListNode head = new ListNode();
        setListNode(head, new int[]{1,2,3,4,5});
        int[] expected = new int[]{2,3};
        ListNode root =
                method.splitListNode(head.next,2,3);
        for(int i=0;i<expected.length;i++){
            assertEquals(expected[i], root.val);
            root = root.next;
        }
    }

    @Test
    void getListNodeSizeTest(){
        LeetCode92 method = new LeetCode92();
        ListNode head = new ListNode();
        setListNode(head, new int[]{1,2,3,4,5});
        int size =
                method.getListNodeSize(head.next);
        assertEquals(size, 5);
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
