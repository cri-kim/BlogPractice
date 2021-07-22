package week.five;
/*
 * int 값을 가지고 있는 이진트리를 나타낼 수 있는 Node 클래스 정의
 * int value, node left, node right를 가져야한다.
 * */
public class BinaryTreeNode {
	int element;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	int depth = 1;
	
	BinaryTreeNode(int element) {
		this.element = element;
		this.left = null;
		this.right = null;
	}
	
	public BinaryTreeNode add(BinaryTreeNode root, int element) {
		BinaryTreeNode newElement = new BinaryTreeNode(element);
		BinaryTreeNode copyNode = root;
		while(copyNode.numOfChildren() > 1) {
			if(copyNode.numOfChildren() % 2 == 0) {
				copyNode = copyNode.left;
			}
			else {
				copyNode = copyNode.right;
			}
		}
		if(copyNode.numOfChildren() %2 == 0) {
			copyNode.left = newElement;
		}
		else {
			copyNode.right = newElement;
		}
		return root;
	}
	
	public int numOfChildren() {
		int children = 0;
		if ( left != null) {
			children = children + 1 + left.numOfChildren();
		}
		if ( right != null) {
			children = children + 1 + right.numOfChildren();
		}
		return children;
	}
}
