//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/

package tree;

class RemoveElements {
	
// Example 1:	
// Input: head = [1,2,6,3,4,5,6], val = 6
// Output: [1,2,3,4,5]
	
// Example 2:
// Input: head = [], val = 1
// Output: []
	
// Example 3:
// Input: head = [7,7,7,7], val = 7
// Output: []
	
//NODE CLASS
	
	static class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}

	static Node head = null;
	static int size = 1;
	
//add Nodes

	public static Node addNodes(Node head, int val){
		Node n = new Node(val);
		n.next = head;
		head = n;
		return head;
	}

//remove elements

	public static Node removeElements(Node head, int val){
		if(head != null && head.val == val){
			head = head.next;
		}			
		
		Node temp = head;
		while(temp != null && temp.next != null){
			if(temp.next.val == val && temp.next != null){
				temp.next = temp.next.next;
			}
			else{
				temp = temp.next;
			}
		}
		System.out.println(head.val);
		return head;
	}

//main method
	public static void main(String args[]){
		Node head = null;
		head = addNodes(head,4);
		head = addNodes(head,3);
		head = addNodes(head,2);
		head = addNodes(head,1);
		//System.out.println(head.val);

		System.out.println(removeElements(head,1));


	}
}
