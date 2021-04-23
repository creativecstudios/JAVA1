package BinarySearchTree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PreOrderLeetCode {

	class Node {
		int val;
		Node left;
		Node right;
		Node (int x){
			this.val = x;
		}
	}

	//createBinaryTree
	public Node createTree() {
		Scanner scanner = new Scanner(System.in);
		Node root = null;
		
		System.out.println("Enter Value");
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

	//PrintResult
	public List<Integer> printNode(Node root) {

		List<Integer> result = new ArrayList<>();
		if(root == null) {
			return null;
		}

		preOrder(root,result);
		
		return result;
	}

	//PreOrder
	public void preOdrer(Node root,List<Integer> result) {
		
		if(root == null) {
			return;
		}
		result.add(root.val);
		
		preOrder(root.left,result);
		preOrder(root.right,result);

	}

	//mainMethod
	public static void main(String args[]) {

		PreOrderLeetCode obj = new PreOrderLeetCode();
		
		//createTree
                Node result = obj.createTree();
		
		//PreOrder print
		List<Integer> output = obj.printNode(result);

		System.out.println(output);

		
	}
}