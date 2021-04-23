//https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PostOrderLeetCode {

	class Node{
		int val;
		Node left;
		Node right;
		Node(int x){
			this.val = x;
		}
	}
	
	public Node createTree() {
		Scanner scanner = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data");
		int val = scanner.nextInt();	
		
		if(val == -1) {
			return null;
		}
		root = new Node(val);
		System.out.println("Enter left for "+val);
		root.left = createTree();
		System.out.println("Enter right for"+val);
		root.right = createTree();
		
		return root;
	}
	
	 public List<Integer> postorderTraversal(Node root) {
	        
	        List<Integer> result = new ArrayList<>();
	        Stack<Node> stack = new Stack<Node>();
	        
	        if(root == null){
	            return result;
	        }
	        
	        Node current = root;
	        while(current != null || !stack.isEmpty()){
	            
	            if(current != null){
	                stack.push(current);
	                current = current.left;
	            }
	            else{
	                Node temp = stack.peek().right;
	                if(temp == null){
	                    temp = stack.pop();
	                    result.add(temp.val);
	                    
	                    while(!stack.isEmpty() && temp == stack.peek().right){
	                        temp = stack.pop();
	                        result.add(temp.val);
	                    }
	                }
	                else
	                    current = temp;
	                
	            }
	        }
	        return result;
	    }
	public static void main(String[] args) {
		PostOrderLeetCode obj = new PostOrderLeetCode();
		
		Node tree = obj.createTree();
		
		List<Integer> result = obj.postorderTraversal(tree);
		
		System.out.println(result);
		
	}

}