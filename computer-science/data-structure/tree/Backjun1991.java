package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

/*
 * 이진 트리를 입력받아 전위 순회(preorder traversal)
 * , 중위 순회(inorder traversal)
 * , 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.
 * */
public class Backjun1991 {
	
	@Test
	public void test() {
		Tree tree = new Tree();
		tree.insertNode("A B C");
		tree.insertNode("B D .");
		tree.insertNode("C E F");
		tree.insertNode("E . .");
		tree.insertNode("F . G");
		tree.insertNode("D . .");
		tree.insertNode("G . .");
		
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
	}

	@Test
	public void test2() {
		Tree tree = new Tree();
		tree.insertNode("A B C");
		tree.insertNode("B D E");
		tree.insertNode("C F G");
		tree.insertNode("D H I");
		tree.insertNode("E J K");
		tree.insertNode("F L M");
		tree.insertNode("G N O");
		tree.insertNode("H P Q");
		tree.insertNode("I R S");
		tree.insertNode("J T U");
		tree.insertNode("K V W");
		tree.insertNode("L X Y");
		tree.insertNode("M . .");
		tree.insertNode("N . .");
		tree.insertNode("O . .");
		tree.insertNode("P . .");
		tree.insertNode("Q . .");
		tree.insertNode("R . .");
		tree.insertNode("S . .");
		tree.insertNode("T Z .");
		tree.insertNode("U . .");
		tree.insertNode("V . .");
		tree.insertNode("R . .");
		tree.insertNode("X . .");
		tree.insertNode("Y . .");
		tree.insertNode("Z . .");
		
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
	}
	@Test
	public void test3 () {
		Tree tree = new Tree();
		tree.insertNode("A B C");
		
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		System.out.println();
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			//1. 이진트리의 노드의 개수
			int n = Integer.valueOf(str);
			//2.n개의 줄에 걸쳐 노드와 왼쪽자식노드, 오른쪽 자식 노드 생성
			Tree tree = new Tree();
			for(int i=0; i< n ;i++) {
				tree.insertNode(br.readLine());
			}
			
			//3. 전위순회
			tree.preOrder(tree.root);
			System.out.println();
			
			//4. 중위순회
			tree.inOrder(tree.root);
			System.out.println();
			
			//5. 후위순회
			tree.postOrder(tree.root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Node {
	String element;
	Node left;
	Node right;
	
	public Node(String e){
		element = e;
	}
}
class Tree {
	Node root;
	public void insertNode(String line) {
		String[] arr = line.split(" ");

		if(root == null) {
			root = new Node(arr[0]);
			root.left = getElemenet(arr[1])==null?null:new Node(getElemenet(arr[1]));
			root.right = getElemenet(arr[2])==null?null:new Node(getElemenet(arr[2]));
		}
		else {
			Search(root, arr[0], arr[1], arr[2]);
		}
	}
	public void Search(Node node, String element, String left, String right) {
		if(node == null) return;
		
		if(node.element.equals(element)) {
			node.left = getElemenet(left)==null?null:new Node(getElemenet(left));
			node.right = getElemenet(right)==null?null:new Node(getElemenet(right));
		}
		else {
			Search(node.left, element, left, right);
			Search(node.right, element, left, right);
		}
	}
	public String getElemenet(String e) {
		if(e.equals(".")) {return null;}
		else {
			return e;
		}
	}
	public void preOrder(Node node) {
		System.out.print(node.element);
		if(node.left != null) preOrder(node.left);
		if(node.right != null) preOrder(node.right);
	}
	public void inOrder(Node node) {
		if(node.left != null) inOrder(node.left);
		System.out.print(node.element);
		if(node.right != null) inOrder(node.right);
	}
	public void postOrder(Node node) {
		if(node.left != null) postOrder(node.left);
		if(node.right != null) postOrder(node.right);
		System.out.print(node.element);
	}
}