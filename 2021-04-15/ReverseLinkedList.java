//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1205/

package tree;

class ReverseLinkedList {
	
	static class Node {
		static int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}

	Node head = null;

	//addNode
	public static Node addNode(Node head, int val){
	
		Node n = new Node(val);
		n.next = head;
		head = n;		
		return head;

	}
	
	//ReverseLinkedlist

	public static Node reverseLinkedList(Node head){

		Stack<Node> stack = new Stack<Node>();
		
		//adding nodes into the stack
		while(head != null){
			stack.push(head);
			head = head.next;
		}

		Node reverse = new Node(0);
		head = reverse;

		while(! stack.isEmpty()){

			Node current = stack.pop();
			head.next = new Node(current.val);
			head = head.next;
		} 
		
		return reverse.next;
	}

	//main method

	public static void main(String args[]){

		Node head = null;
		head = addNode(head,1);
		head = addNode(head,2);
		head = addNode(head,3);
		head = addNode(head,4);
		head = addNode(head,5);
		
		System.out.println(reverseLinkedList(head));
	}
	
}