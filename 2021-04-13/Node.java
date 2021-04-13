//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1212/

package tree;

class Node{
	int val;
	Node next;
	Node(int x){
		this.val = x;
		next = null;
	}

	public static boolean hasCycle(Node head){
		if(head == null){
			return false;
		}		
		Node slow = head;
		Node fast = head.next;

		while(slow != fast){
			if(fast == null || fast.next == null){
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		} 
		return true;
	}
	public static void main(String args[]){
		Node head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node z = new Node(19);

		head.next = a;
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = z;

		hasCycle(head);

	}
} 