//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/

package tree;

public class PalindromeLinkedList {
	class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	Node head = null;
	
//addNode
	public void addNode(int val) {
		Node temp;
		Node dummy;
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
// Palindrome

	public boolean isPalindrome(Node head) {
		Node temp = head;
		if(head == null) {
			return false;
		}
		Node mid = null;
		Node slow = head;
		Node fast = head;
	
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null) {
			mid = slow.next;
		}
		else {
			mid = slow;
		}
		
		Node prev = null;
		Node newNext = null;
		
		while(mid != null) {
			newNext = mid.next;
			mid.next = prev;
			prev = mid;
			mid = newNext;
		}
		while(prev != null){
            if(prev.val != head.val){
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
	
	}
//main method
	public static void main(String args[]) {
		
		PalindromeLinkedList obj = new PalindromeLinkedList();
		obj.addNode(1);
		obj.addNode(2);
		obj.addNode(3);
		obj.addNode(2);
		obj.addNode(1);
		System.out.println("Input");
		obj.printNode(obj.head);
		boolean result = obj.isPalindrome(obj.head);
		System.out.println("\n"+ result);
	}
}
