//https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/

package tree;

class Intersection_of_Two_Linked_Lists {
	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	
	Node head1 = null;
	Node head2 = null;
	

	public static Node addNode(Node head, int val){
		Node n = new Node(val);
		n.next = head;
		n = head;
		return head;
	}

	public static Node makeIntersect(Node head1,Node head2,int pos){
		Node temp1 = head1;
		Node temp2 = head2;
		
		int count1 = 0;
		while(count1 > pos){
			temp1 = temp1.next;
			count1++;
		}
		while(temp2 != null){
			temp2 = temp2.next;
		}
		temp2 = temp1.next;
		
	}
	public static Node intersectionofTwoLinkedList(Node head1, Node head2){
		Node tempA = head1;
		Node tempB = head2;
		while(tempA != tempB){
			tempA = tempA != null ? tempA = tempA.next : headB;
			tempB = tempB != null ? tempB = tempB.next : headA;
		}
		return tempA;
	}

	public static void main(String args[]){
		Node head1 = null;
		Node head2 = null;
		head1 = addNode(head1,1);
		head1 = addNode(head1,2);
		head1 = addNode(head1,3);
		head1 = addNode(head1,8);
		head1 = addNode(head1,5);

		head2 = addNode(head2,1);
		head2 = addNode(head2,2);
		head2 = addNode(head2,8);
		
		makeIntersect(head1,head2,3);
		intersctionofTwoLinkedList(head1,head2);
	}
	
}