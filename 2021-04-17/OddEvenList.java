//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/

package tree;

public class OddEvenDigits {

	class Node{
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
//oddEvenMethod
	public Node oddEvenLidt(Node head) {
		if(head == null) {
			return null;
		}
		Node temp = head;
		
		Node odd = head;
		Node even = head.next;
		Node evenhead = even;
		
		while(even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenhead;
		return head;
	}
	
//main method
	public static void main(String args[]) {
		
		OddEvenDigits obj = new OddEvenDigits();
		
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(6);
		
		System.out.println("Input\n");
		obj.printNode(obj.head);
		
		Node result = obj.oddEvenLidt(obj.head);
		
		System.out.println("\n\nOutput\n");
		obj.printNode(result);
	}
}
