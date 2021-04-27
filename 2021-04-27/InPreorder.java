//https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/943/
package BinarySearchTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreOrderInOrder {

// Example 1:
// Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
// Output: [3,9,20,null,null,15,7]

// Example 2:
// Input: preorder = [-1], inorder = [-1]
// Output: [-1]
 
	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	Map<Integer,Integer> map = new HashMap();
	//InorderPreorder
	public Node inPreOrder(int[] preorder,int[] inorder) {
		for(int i=0; i<inorder.length; i++) {
			map.put(inorder[i], i);
		}
		return builtTree(preorder,inorder,0,inorder.length-1,0);
	}
	
	public Node builtTree(int[] preorder,int[] inorder, int start, int end , int index ) {
		if(start > end ) {
			return null;
		}
		
		Node root = new Node(preorder[index]);
		
		int inIndex = map.get(preorder[index]);
		
		root.left = builtTree(preorder,inorder,start,inIndex-1,index+1);
		
		root.right = builtTree(preorder,inorder,inIndex+1,end,index+inIndex-start+1);
		
		return root;
	}
	
	public Node print(Node root){		
		if(root == null) {
			return null;
		}
		System.out.print(root.val+" ");	
		root.left = print(root.left);
		root.right = print(root.right);
		return root;
	}
	
	public static void main(String args[]) {
		
		PreOrderInOrder obj = new PreOrderInOrder();
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		Node root = obj.inPreOrder(preorder, inorder);
		
		obj.print(root);
		
	}
}
