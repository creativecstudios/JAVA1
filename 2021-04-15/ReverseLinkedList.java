//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/

package tree;

import java.util.Stack;

import tree.Implementation.Node;

public class ReverseLinkedList {
	class Node {
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}

	Node head = null;
	
//addNode
	public void addNode(int val) {
		Node temp;	
		Node dummy;
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
	}
	
//printNode	
	public void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
	
//ReverseLinkedlist
	public Node reverseLinkedList(Node head){

		Stack<Node> stack = new Stack<Node>();
		
		while(head != null) {
			stack.push(head);
			head = head.next;
		}
	
		Node reverse = new Node(0);
		head = reverse;

		while(! stack.isEmpty()){

			Node current = stack.pop();
			head.next = new Node(current.val);
			head = head.next;
		} 
		
		return reverse.next;
	}
	
//reverseLinkedList
	public Node reverseLinked(Node head) {
		
		Node temp = head;
		if(temp == null) {
			return null;
		}
		
		Node pPoint = temp.next;
		Node qPoint = pPoint.next;
		
		temp.next = null;
		
		while(qPoint != null) {
			pPoint.next = temp;
			temp = pPoint;
			pPoint = qPoint;
			qPoint = qPoint.next;
		}
		
		pPoint.next = temp;
		
		return pPoint;
	}

//main method
	public static void main(String args[]){
		
		ReverseLinkedList obj = new ReverseLinkedList();
		
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		
		System.out.println("Input\n");
		obj.printNode(obj.head);
		
		Node result = obj.reverseLinked(obj.head);
		
		System.out.println("\n\nOutput\n");
		obj.printNode(result);
		
		System.out.println("");
		obj.printNode(obj.head);
		
		System.out.println();
		Node result1 = obj.reverseLinkedList(obj.head);
		obj.printNode(result1);

	}
	
}
