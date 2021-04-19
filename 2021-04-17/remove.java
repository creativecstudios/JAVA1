class Remove{

	static class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	static Node head = null;
	
//add Node

	public static Node addNode(Node head, int val){
		Node n = new Node(val);
		n.next = head;
		head = n;
		return head;
	}

// remove elements
	
	public static Node removeElements(Node head, int val){
		
		while(head != null && head.val == val){
			head = head.next;
		}
		
		Node temp = head;
		
		while(temp != null && temp.next != null){
			if(temp.next != null && temp.next.val == val){
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;
			}
		}
		System.out.println(head.val);
		return head;
		
	}
	public static void main(String args[]){
		//System.out.println("4");
		Node head = null;
		head = addNode(head,5);
		head = addNode(head,4);
		head = addNode(head,3);
		head = addNode(head,2);
		head = addNode(head,1);
		removeElements(head,1);
	}
}