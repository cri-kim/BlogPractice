package week.five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTests {
	BinaryTreeNode node = new BinaryTreeNode(1);

	@BeforeEach
	public void addBinaryTreeNodeTest() {
		node = node.add(node,2);
		node = node.add(node,3);
		node = node.add(node,4);
		node = node.add(node,5);
		node = node.add(node,6);
		node = node.add(node,7);
	}
	
	@Test
	public void addBinaryTreeDFSTest() {
		System.out.println("================");
		System.out.println("dfs");
		System.out.println("================");
		BinaryTree tree = new BinaryTree();
		tree.dfs(node);
	}
	
	@Test
	public void addBinaryTreeBFSTest() {
		System.out.println("================");
		System.out.println("bfs");
		System.out.println("================");
		BinaryTree tree = new BinaryTree();
		tree.bfs(node);
	}
}
