package queue;

import linkedlist.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode23Test {
    @Test
    void mergeKListsTest(){
        ListNode d = new ListNode();
        System.out.print(d.val);


        LeetCode23 method = new LeetCode23();
        ListNode expected = new ListNode();
        setListNode(expected, new int[]{1,2,3,4,5});
        ListNode other = new ListNode();
        setListNode(other, new int[]{2,3,5,4,1});
        ListNode[] in = new ListNode[]{other};

        assertEquals(expected.val, method.mergeKLists(in).val);
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
