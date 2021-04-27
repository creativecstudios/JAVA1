//https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/537/
package BinarySearchTree;

import java.util.Scanner;

public class PathSumLeetCode {
	
// Example 1:
// Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
// Output: true
	
// Example 2:
// Input: root = [1,2,3], targetSum = 5
// Output: false
	
// Example 3:
// Input: root = [1,2], targetSum = 0
// Output: false
	
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
		
		System.out.println("Enter right for "+ val);
		root.right = createTree();
		
		return root;
	}
	
	//pathSum
	public boolean pathSum(Node root,int val) {
		if(root == null) {
			return false;
		}
		else if(root.left == null && root.right == null && val-root.val == 0) {
			return true;
		}
		else {
			return pathSum(root.left,val-root.val) || pathSum(root.right,val-root.val);
		}
	}
	//mainfunction
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		PathSumLeetCode obj = new PathSumLeetCode();
		
		Node root = obj.createTree();
		
		System.out.println("Enter sum of paths to check");
		int val = scanner.nextInt();
		
		boolean result = obj.pathSum(root, val);
		
		System.out.println(result);
	}
}
