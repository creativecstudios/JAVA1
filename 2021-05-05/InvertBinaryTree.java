//https://leetcode.com/problems/invert-binary-tree/

package leetCode_Easy_118;

import java.util.Scanner;

public class InvertBinaryTree {

	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	
	//create tree
	public Node createTree() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the data");
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
	
	//Invert Binary Tree
	public Node invertBinaryTree(Node root) {
		
		return invert(root);
	}
	
	public Node invert(Node root) {
		if(root == null) {
			return null;
		}
	
		Node left = invert(root.left);
		Node right = invert(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
	}
	
	public Node printTree(Node root) {
		if(root == null) {
			return null;
		}
		System.out.print(root.val+" ");
		root.left = printTree(root.left);
		root.right = printTree(root.right);
		return root;
	}
	public static void main(String[] args) {
		
		InvertBinaryTree obj = new InvertBinaryTree();
		
		Node root = obj.createTree();
		
		Node result = obj.invertBinaryTree(root);
		
		obj.printTree(result);
	}
}
