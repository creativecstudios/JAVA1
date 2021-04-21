https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1296/

package tree;

public class RemoveNthfromEnd {

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
	
	//Remove Nth node
	public Node removeNfromEnd(Node head, int n) {
		Node temp = head;
		
		Node fast = head;
		Node slow = head;
		for(int i=1; i<n+1; i++) {
			fast = fast.next;
		}
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return temp;
	}
	public static void main(String args[]) {
		
		RemoveNthfromEnd obj = new RemoveNthfromEnd();
		
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		System.out.println("Input");
		obj.printNode(obj.head);
		Node result = obj.removeNfromEnd(obj.head, 4);
		System.out.println();
		obj.printNode(result);
	}
}
