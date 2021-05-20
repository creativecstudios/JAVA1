package LeetCode118;

import java.util.Scanner;

public class AddLeftLeaves {

	class Node{
		Node left;
		Node right;
		int val;
		Node(int x){
			this.val = x;
		}
	}
	
	//addNode
	public Node addNode() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter data");
		int val = scanner.nextInt();
		
		if(val == -1) {
			return null;
		}
		
		Node root = new Node(val);
		
		System.out.println("left for "+ val);
		
		root.left = addNode();
		
		System.out.println("right for"+ val);
		
		root.right = addNode();
		
		return root;
		
	}
	int sum = 0;
	
	public int addLeftLeaves(Node root) {
		addleft(root);
		return sum;
	}

	
	public void addleft(Node root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			if(root.left.left == null && root.right.left == null) {
				sum = sum + root.left.val;
			}
		}
		
	}
	
	public static void main(String[] args) {
		

		AddLeftLeaves obj = new AddLeftLeaves();
		
		Node root = obj.addNode();
		
		int result = obj.addLeftLeaves(root);
	}
}
