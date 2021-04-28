//https://leetcode.com/problems/minimum-depth-of-binary-tree/

package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumDepth {

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
	
	//finding minimum depth
	public int minimumDepth(Node root) {
		if(root == null) {
			return 0;
		}
		
		Queue<Node> queue = new LinkedList();
		//adding root node to queue and initializing depth to 1
		queue.add(root);
		int depth = 1;
		
		while(! queue.isEmpty()) {
			//defining the size of the queue 
			int size = queue.size();
			for(int i = 0; i <size; i++) {
				
				//at first it loop runs only one time since queue has only element ie. root
				//if root has left and right child then it gets added into the queue by next loop the size of queue increases and so on.
				
				root = queue.poll();
				
				//rather than checking all the left and right child of the root.
				//if any one of the child's right and left leaf becomes null then we find the minimum depth. 
				if(root.left == null && root.right == null) {
					return depth;
				}
				if(root.left != null) {
					queue.add(root.left);
				}
				if(root.right != null) {
					queue.add(root.right);
				}
				
			}
			depth++;
		}

		return 0;
	}
	
	public static void main(String[] args) {
		
		MinimumDepth obj = new MinimumDepth();
		
		Node root = obj.createTree();
		
		int result = obj.minimumDepth(root);
		
		System.out.println(result);
	}
}
