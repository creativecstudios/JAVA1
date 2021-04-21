//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/
package tree;

public class LinkedListCycle {

	class Node{
		int val;
		Node next;
		Node(int x ){
			this.val = x;
		}
	}
	Node head = null;
	
//addNode
	public void addNode(int val){

		Node temp;
		Node dummy;
		temp = new Node(val);

		if(head == null){
			head = temp;
		}
		else{
			dummy = head;
			while(dummy.next!= null){
				dummy = dummy.next;
			}
			dummy.next = temp ;
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
//To create loop at nth position
	
	public Node makeLoop(Node head,int pos) {
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
	
//check cycle
	public boolean hasCycle(Node head) {
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
			fast = fast.next.next;
		}
		return true;
	}
	
//main function
	public static void main(String args[]) {
		
		LinkedListCycle obj = new LinkedListCycle();
		
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		
		obj.printNode(obj.head);
		//creating loop
		obj.makeLoop(obj.head,3);
		boolean result = obj.hasCycle(obj.head);		
		System.out.println("\n"+result);

	}
}  