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
	Node head = null;
	Node head1 = null;
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
	
//addNode
	public void addNode1(int val) {
		Node temp,dummy;
		temp = new Node(val);
		if(head1 == null) {
			head1 = temp;
		}
		else {
			dummy = head1;
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
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(4);
		obj.addNode(5);
		obj.addNode(6);
//input head2		
		obj.addNode1(8);
		obj.addNode1(2);
		obj.addNode1(3);
		obj.addNode1(1);
		
		System.out.println("Head1");
		obj.printNode(obj.head);
		System.out.println();
		
		System.out.println("Head2");
		obj.printNode(obj.head1);
		System.out.println();
		
		System.out.println("Make Intersection");
		obj.makeIntersect(obj.head, obj.head1, 3);
		
		System.out.println("Intersection");
		obj.intersectionofTwoLinkedList(obj.head, obj.head1);
	}
}
