package linkedlist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LeetCode21Test {
    @Test
    void mergeTwoListsTest(){
        LeetCode21 method = new LeetCode21();

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        setListNode(l1, new int[]{1,2,4});
        setListNode(l2, new int[]{1,3,4});
        //printListNode(method.mergeTwoLists(l1.next,l2.next));
        assertThat(method.mergeTwoLists(l1.next,l2.next).val).isEqualTo(1);

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
