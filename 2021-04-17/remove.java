//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/
class Remove{
// Example 1:	
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
	
// Example 2:
// Input: head = [], val = 1
// Output: []
	
// Example 3:
// Input: head = [7,7,7,7], val = 7
// Output: []
	
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
