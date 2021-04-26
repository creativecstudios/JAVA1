//https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/535/
package BinarySearchTree;

import java.util.Scanner;

public class DepthofBinaryTree {

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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data");
		int val = scanner.nextInt();
		if(val == -1) {
			return null;
		}
		
		Node root = new Node(val);
		
		System.out.println("Enter left for "+val);
		root.left = createTree();
		System.out.println("Enter right for "+val);
		root.right = createTree();
		return root;
	}
	
	//DepthofBinaryTree
	public int maxDepthofTree(Node root) {
		if(root == null) {
			return 0;
		}
		
		int left = maxDepthofTree(root.left);
		
		int right = maxDepthofTree(root.right);
		
		return Math.max(left, right)+1;
	}

	public static void main(String args[]) {
		
		DepthofBinaryTree obj = new DepthofBinaryTree();
		
		Node root = obj.createTree();
		
		int result = obj.maxDepthofTree(root);
		
		System.out.println("result "+result);
	}
}
