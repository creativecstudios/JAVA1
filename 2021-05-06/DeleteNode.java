//https://leetcode.com/problems/delete-node-in-a-linked-list/
package leetCode_Easy_118;

public class DeleteNode {
// 	Example 1:
// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

// 	Example 2:
// Input: head = [4,5,1,9], node = 1
// Output: [4,5,9]
// Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
// 	Example 3:
// Input: head = [1,2,3,4], node = 3
// Output: [1,2,4]
// 	Example 4:
// Input: head = [0,1], node = 0
// Output: [1]
// 	Example 5:
// Input: head = [-3,5,-99], node = -3
// Output: [5,-99]
 

	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	Node head = null;
	//addNode
	public Node addNode(int val) {
		Node dummy;
		Node temp;
		temp = new Node(val);
		if(head == null) {
			head = temp;
		}
		else {
			dummy = head;
			while(dummy.next != null) {
				dummy = dummy.next;
			}
			dummy.next = temp;
		}
		return head;
	}
	
	//delete node
	public void deletenode(Node node) {
		
		Node temp = node.next;
		
		node.val = node.next.val;
		node.next = node.next.next;
		temp.next = null;
	}
	//get node
	public Node getNode(int val) {
		if(head == null) {
			return null;
		}
		Node temp = head;
		
		while(temp.val != val) {
			temp = temp.next;
		}
		return temp;
	}
	//printNode
	public void printNode(Node head) {
		if(head == null) {
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		DeleteNode obj = new DeleteNode();
		
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(9);
		
		obj.printNode(obj.head);
		Node get = obj.getNode(5);
		
		obj.deletenode(get);
		
		System.out.println();
		obj.printNode(obj.head);
	}
}
