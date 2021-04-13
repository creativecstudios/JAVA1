https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/

package tree;

class LinkedListCycleII {

	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			this.val = x;
		}
	}
	public static ListNode linkdeistCycleII(ListNode head){
		if(head == null){
			return null
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
			}
		}
		return false;
	}
}