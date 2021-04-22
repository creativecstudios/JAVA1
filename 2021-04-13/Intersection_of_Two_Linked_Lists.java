//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/

package tree;

public class Intersection_of_Two_Linked_Lists {
	
	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	Node head1 = null;
	Node head2 = null;
	
//addHead
	public Node addHead(Node head,int val){
		if(head == null){
			head = new Node(val);
		}
		return head;
	}	
//addNode
	public void addNode(Node head,int val) {
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
	
//makeIntersect
	public Node makeIntersect(Node head1,Node head2,int n) {
		Node temp1 = head1;
		Node temp2 = head2;
		int count = 0;
		while(count < n) {
			temp1 = temp1.next;
			count++;
		}
		
		while(temp2.next != null) {
			temp2 = temp2.next;
		}	
		temp2.next = temp1;
		System.out.println(temp2.next.val);
		return head1;
	}

//IntersectionMethod1
	pubic Node intersectionofLinkedList(Node headA, Node headB) {
	
		Set<Node> visited = new Hashset<>();
		
		while(headA != null) {
			visited.add(headA);
			headA = headA.next;
		}	
		while(headB != null) {
			if(visited.contains(headB)){
				return headB;
			}
			headB = headB.next;
		}
		return null;
	}
//IntersectionMMethod2	
	public Node intersectionofTwoLinkedList(Node head1, Node head2){
		Node tempA = head1;
		Node tempB = head2;
		while(tempA != tempB){
			tempA = tempA != null ? tempA = tempA.next : head1;
			tempB = tempB != null ? tempB = tempB.next : head2;
		}
		System.out.println(tempA.val);
		return tempA;
	}

	public static void main(String args[]){
		Intersection_of_Two_Linked_Lists obj = new Intersection_of_Two_Linked_Lists();
//input head1		
		Node head1 = obj.addHead(obj.head1, 1);
		obj.addNode(head1, 2);
		obj.addNode(head1, 3);
		obj.addNode(head1, 4);
		obj.addNode(head1, 5);
		obj.addNode(head1, 2);
//input head2	
		Node head2 = obj.addHead(obj.head2, 4);
		obj.addNode(head2, 2);
		obj.addNode(head2, 8);
		obj.addNode(head2, 5);
	
		System.out.println("Head1");
		obj.printNode(head1);
		System.out.println();
		
		System.out.println("Head2");
		obj.printNode(head2);
		System.out.println();
		
		System.out.println("Make Intersection");
		obj.makeIntersect(head1,head2, 3);
		
		System.out.println("Intersection of two LinkedList");
		obj.intersectionofTwoLinkedList(head1, head2);
	}
}
