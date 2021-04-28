//https://leetcode.com/problems/balanced-binary-tree/submissions/
package BinarySearchTree;

import java.util.Scanner;

public class BalancedBinaryTree {

	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	//createTree
	public Node createTree() {
		Node root = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter data");
		int val = scanner.nextInt();
		
		if(val == -1) {
			return null;
		}
		
		root = new Node(val);
		
		System.out.println("Enter left for "+val);
		root.left = createTree();
		
		System.out.println("Enter right for "+val);
		root.right = createTree();
		
		return root;
	}
	

//finding balanced binary tree (i.e) the height of left and right subtree should be same or differenc b/w L and R is nor more than one.
	//isBalancedTree
	public boolean isBalancedTree(Node root) {
		return height(root) != -1;
	}
	
	//finding height or depth of the tree
	public int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		int left = height(root.left);
		int right = height(root.right);
		
//if the differenc between the height of left or right > 1 then it defined as unbalanced tree
		if(left == -1 || right == -1 || Math.abs(left-right) > -1) {
			return -1;
		}
		
		return Math.max(left, right)+1;
	}
	
	//main function
	public static void main(String args[]) {
		
		BalancedBinaryTree obj = new BalancedBinaryTree();
		
		Node root = obj.createTree();
		
		boolean result = obj.isBalancedTree(root);
		
		System.out.println(result);
	}
}
