package Jp;

public class RemoveNthNode {

	static class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	
	static Node head = null;
	//addNode
	public static Node addNode(int val) {
		Node curr = new Node(val);
		
		if(head == null) {
			head = curr;
		}
		
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = curr;
		}
		return head;
	}
	
	public static Node RemoveFromNth(Node head,int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node temp = head;
		int count = 0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		count -= n;
		
		temp = dummy;
		while(count > 0) {
			count--;
			temp = temp.next;
			
		}
		temp.next = temp.next.next;
		return dummy.next;
	}
	
	
	public static void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		Node head = addNode(5);
		
		RemoveFromNth(head,2);
		printNode(head);
		
	}
}
