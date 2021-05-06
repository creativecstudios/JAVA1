//https://leetcode.com/problems/delete-node-in-a-linked-list/
package leetCode_Easy_118;

public class DeleteNode {

	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	Node head = null;
	//addNode
	public Node addNode(int val) {
		Node dummy;
		Node temp;
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
		return head;
	}
	
	//delete node
	public void deletenode(Node node) {
		
		Node temp = node.next;
		
		node.val = node.next.val;
		node.next = node.next.next;
		temp.next = null;
	}
	//get node
	public Node getNode(int val) {
		if(head == null) {
			return null;
		}
		Node temp = head;
		
		while(temp.val != val) {
			temp = temp.next;
		}
		return temp;
	}
	//printNode
	public void printNode(Node head) {
		if(head == null) {
			return;
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		DeleteNode obj = new DeleteNode();
		
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(9);
		
		obj.printNode(obj.head);
		Node get = obj.getNode(5);
		
		obj.deletenode(get);
		
		System.out.println();
		obj.printNode(obj.head);
	}
}
