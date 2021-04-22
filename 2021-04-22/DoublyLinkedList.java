package tree;

public class DoublyLinkedList {

	class Node{
		int val;
		Node next;
		Node prev;
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
			temp.prev = dummy;
			temp.next = null;	
		}	
	}
	//print node
	public void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}
	public static void main(String args[]) {
		
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.printNode(obj.head);
		
	}
}