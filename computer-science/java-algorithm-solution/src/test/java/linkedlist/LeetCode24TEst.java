package linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode24TEst {
    @Test
    void swapPairsTest(){
        LeetCode24 method = new LeetCode24();

        ListNode head = new ListNode();
        setListNode(head, new int[]{});
        ListNode root = method.swapPairs(head.next);
        int[] expected = new int[]{};
        for(int i=0;i<expected.length;i++){
            assertEquals(root.val, expected[i]);
            root = root.next;
        }
    }

    //예시 만드는데 약 20분
    private void printListNode(ListNode root){
        ListNode temp = root.next;
        while(temp !=null){
            System.out.println(temp.val);
            temp = temp.next;
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
