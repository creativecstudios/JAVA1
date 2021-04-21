https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/

package tree;

public class LinkedListCycleII {

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
		Node temp,dummy;
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
	
//make loop / cycle
	public Node makeCycle(Node head,int pos){

		Node temp = head;
		int count = 1;
		while(count < pos){
			temp = temp.next;
			count++;
		}
		Node posistion = temp;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = posistion;
		return head;

	}
//LinkedListcycle2
	public Node linkdeistCycleII(Node head){
		if(head == null){
			return null;
		}
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null){
			
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast){
				slow = head;
				while(slow != fast){
					slow = slow.next;
					fast = fast.next;
				}
			System.out.println("\nOutput "+slow.val);
			return slow;
			
			}
		}
		return null;
	}

//Main function

	public static void main(String args[]) {
		
	LinkedListCycleII obj = new LinkedListCycleII();
		
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(8);
		obj.addNode(7);
		obj.addNode(5);
		obj.addNode(6);
		
		obj.printNode(obj.head);
		
		obj.makeCycle(obj.head, 3);
		
		obj.linkdeistCycleII(obj.head);
	}

}