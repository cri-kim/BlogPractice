package structure.test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import structure.ListNode;

public class LinkedListTests {
	
	private static ListNode node;
	
	@BeforeAll
	static void init() {
		System.out.println("@BeforeAll - executes once before all test methods in this class");
		node = new ListNode(17);
	}
	
	@DisplayName("ListNode Add 동작 성공")
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5,6,7,8,9,0})
	void ListNodeAdd(int item) {
		ListNode nodeToAdd = new ListNode(item);
		node = node.add(node, nodeToAdd, 0);
	}

	@DisplayName("ListNode Remove 동작 성공")
	@Test
	void ListNodeRemove() {
		node = node.remove(node, 0);
	}

	@DisplayName("ListNode Contains 동작 성공")
	@Test
	void ListNodeContains() {
		ListNode nodeToCheck = new ListNode(17);
		assertTrue(node.contains(node, nodeToCheck));
	}
	
	void printListNode(ListNode node) {
		while(node != null) {
			System.out.print(node.getItem());
			node = node.getNext();
		}
		System.out.println("");
	}
}
