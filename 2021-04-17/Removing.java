
import java.util.Scanner;
class Removing {
	class Node {
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	Node head = null;
	Node tail = null;
	int size = 0;
	
//Initializing Nodes

	Removing() {
		head = new Node(0);
		tail = new Node(0);
		head.next = tail;
	}	

//addNodes

	public Node addAtIndex(int index, int val) {
		if(index < 0 || index > size){
			return null;
		}
		Node temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}

		Node n = new Node(val);
		n.next = temp.next;
		temp.next = n;
		size++;
		return head;
		
	}

//removeElements
	public Node removeElements(Node head, int val) {
		
		while(head != null && head.val == val){
			head = head.next;
		}

		Node temp = head;

		while(temp != null && temp.next != null) {
			if(temp.next != null && temp.next.val == val) {
				temp.next = temp.next.next;
			} 
			else {
				temp = temp.next;
			}
		}
		return head;
	}
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);

		Removing obj = new Removing();
				
//size of the linkde list
		System.out.println("Input the size of the linkded list");
		int size = scanner.nextInt();

//get Head
		System.out.println("input head value");
		Node head = obj.addAtIndex(0,scanner.nextInt());

//traversing the list
		System.out.println("Input the node values");
		for(int i= 1; i < size; i++){
			obj.addAtIndex(i,scanner.nextInt());
		}

//Before Removing
		System.out.println("Before Removing Elements");
		Node temp = head;
		while(temp != null){
			System.out.print(temp.val+ " ");
			temp = temp.next;
		}
	
		System.out.println("\n Enter the value to remove");
		obj.removeElements(head,scanner.nextInt());
		Node dummy = head;
		
		System.out.println("After removing elemets");
		while(dummy != null){
			System.out.print(dummy.val+" ");
			dummy = dummy.next;
		}
		
	}
}