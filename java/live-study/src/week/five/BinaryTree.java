package week.five;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public void bfs(BinaryTreeNode root) {
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			BinaryTreeNode node = q.poll();
			System.out.println(node.element);
			
			if(node.left != null) {
				q.offer(node.left);
			}
			if(node.right != null) {
				q.offer(node.right);
			}
		}
	}
	
	/*왼쪽, 루트, 오른쪽 순으로 순회*/
	public void dfs(BinaryTreeNode node) {
		if(node == null) {
			return;
		}
		dfs(node.left);
		System.out.println(node.element);
		dfs(node.right);
	}
}
