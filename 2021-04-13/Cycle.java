//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
package tree;

import tree.Implementation.Node;

public class Cycle {

	static class Node{
		int val;
		Node next;
		Node(int x ){
			this.val = x;
			next = null;
		}
	}
	static Node head = null;
	static int size = 0;
	
//	public static Node addAtIndex(int index,int val)          {
//		if(index < 0 || index > size){
//			return null;
//		} 
//		Node temp = head;
//		for(int i = 0; i < index; i++){
//			temp = temp.next;
//		}
//		Node n = new Node(val);
//		n.next = temp.next;
//		temp.next = n;
//		size++;
//		return temp;
//	} 
	
	//To create loop at nth position
	
	static Node makeLoop(Node head,int pos) {
		Node temp = head;
		int count = 1;
		while(count < pos) {
			temp = temp.next;
			count ++;
		}
		Node posistion = temp;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = posistion;
		return head;
	}
	
	//Add node and value
	public static Node addNode(Node head,int val) {
		Node n = new Node(val);
		n.next = head;
		head = n;
		return head;
	}
	
	//check cycle
	public static boolean hasCycle(Node head) {
		if(head == null) {
			return false;
		}
		Node slow = head;
		Node fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			head = head.next.next;
		}
		return true;
	}
	
	//main function
	public static void main(String args[]) {
		
//		addAtIndex(1,1);
//		addAtIndex(2,2);
//		addAtIndex(3,3);
//		addAtIndex(4,4);
//		addAtIndex(5,5);
		
		
		Node head = null;
		head = addNode(head,5);
		head = addNode(head,4);
		head = addNode(head,3);
		head = addNode(head,2);
		head = addNode(head,1);
		
		makeLoop(head,3);
		
		System.out.println(hasCycle(head));
			
	}
} 