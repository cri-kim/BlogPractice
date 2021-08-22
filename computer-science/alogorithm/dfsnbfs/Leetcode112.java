package dfsnbfs;

/*
 * Given the root of a binary tree and an integer targetSum, 
 * return true if the tree has a root-to-leaf path such 
 * that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 * 
 * Binary Tree와 정수 targetSum이 주어진다.
 * 트리의 경로를 따라 모든 값을 더하는 것이 targetSum과 같다면 true를 반환한다.
 * */
public class Leetcode112 {
	
    public boolean hasPathSum(TreeNode root, int targetSum) {

    	//트리가 null일 경우, targetSum을 확인할 수 없기 때문에 false
    	if(root == null) return false;
    	
    	//각 탐색마다 targetSum을 지워나가며 결국 targetSum이 0이될때를 확인 한다.
    	//targetSum  == 0 이란 것은, 해당 경로까지 sum이 targetsum과 동일하다는 것이다.
    	int cal = targetSum - root.val;
    	
    	//left,right가 없을때까지 탐색했는지 확인
    	if(root.left == null && root.right== null) {
    		if(cal == 0) return true;
    		return false;
    	}
    	//해당 트리의 각 잎(left/right) 탐색
    	return hasPathSum(root.left, cal) || hasPathSum(root.right, cal);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}