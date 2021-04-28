//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/

package BinarySearchTree;

public class ArraytoBinaryTree {

	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	

//this problem is about converting sorted array into binary tree
	//array to binarytree
	public Node arrayToBinaryTree(int[] arr) {
		if(arr == null || arr.length == 0){
			return null;
		}
	
//making a recursive call 	
		return recursiveBinary(arr,0,arr.length-1);
	}
	//recursive call
	public Node recursiveBinary(int[] arr, int left, int right) {

//as we know in binary tree root.left < node and root.right > node to check that this if case
		
		if(left > right) {
			return null;
		}

//finding the mid point of the array to initialize the root node and so on...
		
		int mid = (left + right)/2;
		Node current = new Node (arr[mid]);

//making recursive call for left and right subtree	
		current.left = recursiveBinary(arr,left,mid-1);
		current.right = recursiveBinary(arr,mid+1,right);
		
		return current;
		
	}
	
	//print
	public Node print(Node root) {
		if(root == null) {
			return null;
		}
		System.out.print(root.val+" ");

		root.left = print(root.left);
		root.right = print(root.right);
		return root;
	}

//main method
	public static void main(String args[]) {
		ArraytoBinaryTree obj = new ArraytoBinaryTree();
		
		int arr[] = {-9,-10,-3,0,5,9,6};
		
		Node root = obj.arrayToBinaryTree(arr);
		
		obj.print(root);
	}
}
