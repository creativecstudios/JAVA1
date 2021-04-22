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
		
//user input = -1 => it returns the value (ie.) the particular function terminated form the stack.....		
		
		//BaseCase
		if(val == -1) {
			return null;
		}
		
		root = new Node(val);
		
//enter the value for root.left now this becomes new root and this again create a new function which calls root.left and root.right and so on....
//if root.left = null annd root.right = null the function terminates and the call go to line(37) root.right 
		
		System.out.println("Enter left for "+val);
		root.left = createTree();
		
// root.right it calls a new function which calls root.left and root.right and so on.. until input becomes -1 and it returns null at last it removed from stack..	
		
		System.out.println("Enter right for "+val);
		root.right = createTree();
		
//when all get completed the root (ie.) first entered root address will be stored in root and it is returned when createTree called in main function..
		return root;
	}
	
//printNode
	public void preOrder(Node root) {
//In preorder traversal first it traverse the root
//then root.left and at last root.right
		
//this acts as base case when the root address == null it return and the function gets terminated...
		if(root == null) {
			return;
		}
//if root has a value it gets printed first and searches for its root.left and root.right address if both becomes null it gets terminated or it contiues 
// root.left act as root if it is not null will move for again root.lef and root.right and so on until both the function becomes null then it get terminated...
//root.left similar to root.right...
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
