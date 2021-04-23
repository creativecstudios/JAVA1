//https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/

package BinarySearchTree;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class InOrderLeetCode {

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [1]
Output: [1]

Example 4:
Input: root = [1,2]
Output: [2,1]

Example 5:
Input: root = [1,null,2]
Output: [1,2]

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
	
	//InOrder
	public List<Integer> inOrderTraversal(Node root){
		List<Integer> result = new ArrayList<>();
		Stack<Node> stack = new Stack<Node>();
		if(root == null) {
			return result;
		}
		
		while(true) {
			if(root != null) {
				stack.push(root);
				root = root.left;
			}
			else {
				if(stack.isEmpty()) {
					break;
				}
				root = stack.pop();
				result.add(root.val);
				root = root.right;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		InOrderLeetCode obj = new InOrderLeetCode();
		
		Node Tree = obj.createTree();
		
		List<Integer> result = obj.inOrderTraversal(Tree) ;
		
		System.out.println(result);
		
	}
}
