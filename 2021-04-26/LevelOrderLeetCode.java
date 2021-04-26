//https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931/
package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderLeetCode {

// Example 1:
// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[9,20],[15,7]]

// Example 2:
// Input: root = [1]
// Output: [[1]]
	
// Example 3:
// Input: root = []
// Output: []
	
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
	
	//levelOrder
	public List<List<Integer>> levelOrder(Node root){
		
		List<List<Integer>> result = new ArrayList<>();
		 
		if(root == null) {
			return result;
		}
		
		Queue<Node> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(! queue.isEmpty()) {
			
			int size = queue.size();
			
			List<Integer> currentlist = new ArrayList<>();
			
			for(int i = 0; i < size; i++) {
				Node current = queue.remove();
				currentlist.add(current.val);
				
				if(current.left != null) {
					queue.add(current.left);
				}
				
				if(current.right != null) {
					queue.add(current.right);
				}
			}
			result.add(currentlist);
		}
		return result;
		
	}
	public static void main(String args[]) {
		
		LevelOrderLeetCode obj = new LevelOrderLeetCode();
		
		Node root = obj.createTree();
		
		List<List<Integer>> result = new ArrayList<>();
		
		result = obj.levelOrder(root);
		
		System.out.println(result);
		
	}
}
