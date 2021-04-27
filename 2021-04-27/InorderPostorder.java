//https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/942/

package BinarySearchTree;

import java.util.HashMap;
import java.util.Map;

public class InorderPostorder {

Example 1:
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: inorder = [-1], postorder = [-1]
Output: [-1]

	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	Map<Integer,Integer> map = new HashMap();
	public Node buildTree(int[] inorder, int[] postorder) {
		
		for(int i= 0; i<inorder.length; i++) {
			map.put(inorder[i], i);
		}
		return inPost(inorder,postorder,0,inorder.length-1,postorder.length-1);
	}
	
	public Node inPost(int[] inorder, int[] postorder, int start, int end, int index) {
		if(start > end) {
			return null;
		}	
		Node root = new Node(postorder[index]);
		int inorderIndex = map.get(postorder[index]);
		
		root.right = inPost(inorder,postorder,inorderIndex+1,end,index-1);
		root.left = inPost(inorder,postorder,start,inorderIndex-1,index-(end-inorderIndex)-1);
		
		return root;
	}
	
	public Node printNode(Node root) {
		if(root == null) {
			return null;
		}
		System.out.print(root.val+" ");
		root.left = printNode(root.left);
		root.right = printNode(root.right);
		
		return root;
	}
	
	public static void main(String args[]) {
		
		int[] inorder = {9,3,15,20,7};
		int[] postorder = {9,15,7,20,3};
		
		InorderPostorder obj = new InorderPostorder();
		
		Node root = obj.buildTree(inorder, postorder);
		
		obj.printNode(root);
	}
}
