https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/536/
package BinarySearchTree;

public class SymmetricTree {

// Example 1:
// Input: root = [1,2,2,3,4,4,3]
// Output: true

// Example 2:
// Input: root = [1,2,2,null,3,null,3]
// Output: false	

	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	
	public boolean isSymmetric(BinarySearchTree.DepthofBinaryTree.Node root) {
		
		if(root == null) {
			return true;
		}
		
		return isSymmetric(root.left);
	}
	
	public boolean isSymmetric(Node left,Node right) {
		
		if(left == null && right == null) {
			return left == right;
		}
		if(left.val != right.val) {
			return false;
		}
		
		return isSymmetric(left.left, right.right) && isSymmetric(left.right,right.left);
	}
	
	
	public static void main(String args[]) {
		
		SymmetricTree obj = new SymmetricTree();
		
		DepthofBinaryTree ref = new DepthofBinaryTree();
		
		BinarySearchTree.DepthofBinaryTree.Node root = ref.createTree();
		
		boolean result = obj.isSymmetric(root);
	
		System.out.println(result);
	}
	
}
