https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/

package tree;

class LinkedListCycleII {
	
// Example 1:
// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.
	
// Example 2:
// Input: head = [1,2], pos = 0
// Output: tail connects to node index 0
// Explanation: There is a cycle in the linked list, where tail connects to the first node.
	
// Example 3:
// Input: head = [1], pos = -1
// Output: no cycle
// Explanation: There is no cycle in the linked list.
	
	static class Node{
		int val;
		Node next;
		Node(int x){
			this.val = x;
		}
	}
	static Node head = null;

//addNode
	public static Node addNode(Node head, int val){
		Node n = new Node(val);
		n.next = head;
		head = n;
		return head;
	}

//make loop / cycle
	public static Node makeCycle(Node head,int pos){

		Node temp = head;
		int count = 1;

		while(count < pos){
			temp = temp.next;
			count++;
		}

		Node posistion = temp;
		System.out.println(posistion.val);
		while(temp.next != null){
			temp = temp.next;
		}

		temp.next = posistion;

		return head;

	}
//LinkedListcycle2
	public static Node linkdeistCycleII(ListNode head){
		if(head == null){
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null){
			
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast){
				slow = head;
				while(slow != fast){
					slow = slow.next;
					fast = fast.next;
				}
			return slow;
			System.out.println(slow.val);
			}
		}
		return null;
	}

//Main function

	public static void main(String args[]){
		Node head = null;
		head = addNode(head,6);
		head = addNode(head,5);
		head = addNode(head,4);
		head = addNode(head,3);
		head = addNode(head,2);
		head = addNode(head,1);
		makeCycle(head,3);
		System.out.println(linkdeistCycleII(head));
	}
}
