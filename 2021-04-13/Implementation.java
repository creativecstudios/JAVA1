package tree;
 
class Implementation{
	static class Node{
		int val;
		Node next;
		Node (int x){
			this.val = x;
		}
		
	}
	Node head = null;
	static int size = 0;
	static Node makeLoop(Node head,int pos) {
		Node temp = head;
		int count = 0;
		while(count > pos) {
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
	
	public Node addNode(Node head,int val) {
		Node n = new Node(val);
		n.next = head;
		head = n;
		return head;
	}
	public boolean hasCycle(Node head) {
		Node slow = head;
		Node fast = head.next;
		if(fast == null || fast.next == null) {
			return false;
		}
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Node head = null;
		Implementation obj = new Implementation();
		head = obj.addNode(head, 1);
		head =obj.addNode(head, 2);
		head =obj.addNode(head, 3);
		head =obj.addNode(head, 4);
		head =obj.addNode(head, 5);
		head =obj.addNode(head, 10);
		//obj.makeLoop(head, 2);
		System.out.println(obj.hasCycle(head));
	}
}