package tree;

public class RemovingElements{

	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	Node head = null;
//addElements
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

//remove elements

	public Node removeElements(Node head, int val){
		if(head != null && head.val == val){
			head = head.next;
		}			
		
		Node temp = head;
		while(temp != null && temp.next != null){
			if(temp.next.val == val && temp.next != null){
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;
			}
		}
		return head;
	}
	
	//printNode
	public void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}

//main method
	public static void main(String args[]){
		
		 RemovingElements obj = new  RemovingElements();
		 
		 obj.addNode(1);
		 obj.addNode(2);
		 obj.addNode(3);
		 obj.addNode(4);
		 obj.addNode(5);
		 System.out.println("Before Removing");
		 obj.printNode();
		 Node temp = obj.removeElements(obj.head,2);
		 System.out.println("\nAfter Removing");
		 obj.printNode(temp);
		
	}

}
