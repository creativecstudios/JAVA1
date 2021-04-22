package BinarySearchTree;
import java.util.Scanner;

public class BinaryTreeAddPrint {
	
	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	
	
//addMethod
	public Node createTree() {
		
		Scanner scanner = new Scanner(System.in);		
		Node root = null;
		System.out.println("Enter data");
		int val = scanner.nextInt();	
		
		//BaseCase
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
	
//printNode
	public void preOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	public static void main(String[] args) {
		
		BinaryTreeAddPrint obj = new BinaryTreeAddPrint();
		Node result = obj.createTree();
		obj.preOrder(result);
		
	}
}