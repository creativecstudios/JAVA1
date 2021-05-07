//https://leetcode.com/problems/binary-tree-paths/

package leetCode_Easy_118;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	//binary tree paths
	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	public static List<String> binarytreepaths(leetCode_Easy_118.InvertBinaryTree.Node root){
		List<String> list = new ArrayList();
		String str = "";
		linkNodearrow(root,list,str);
		return list;
	}
	public static void linkNodearrow(leetCode_Easy_118.InvertBinaryTree.Node root, List<String> list, String str) {
		
		if(root.left == null && root.right == null) {
			str += ""+root.val;
			list.add(str);
			return;
		}
		
		str += root.val+"->";
		if(root.left != null) {
			linkNodearrow(root.left, list, str);
		}
		if(root.right != null) {
			linkNodearrow(root.right, list, str);
		}
	}
	
	
	public static void main(String[] args) {
		InvertBinaryTree obj = new InvertBinaryTree();
		
		leetCode_Easy_118.InvertBinaryTree.Node root = obj.createTree();
		
		List<String> result = new ArrayList();
		
		result = binarytreepaths(root);
		System.out.println(result);
		

	}

}
