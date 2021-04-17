//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/

package tree;

class PalindromeList{
	
// Example 1:
// Input: head = [1,2,2,1]
// Output: true
	
// Example 2:
// Input: head = [1,2]
// Output: false
	
    class Node{
	int val;
	Node next;
	Node(int x){
		this.val = x;
	}
    }

    Node head = null;

//addNode
    public static Node addNode(Node head, int val){
	Node n = new Node(val);
	n.next = head;
	head = n;
	return head;	
    }

//Palindrome method
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node mid = null;
//obtaining mid value if values are odd
        if(fast != null){
            mid = slow.next;
        }
//obtaining mid value if values are even
        else{
            mid = slow;
        }
        
        Node prev = null;
        Node newnext = null;

//reversing the nodes from mid to tail   
   
        while(mid != null){
            newnext = mid.next;
            mid.next = prev;
            prev = mid;
            mid = newnext;
        }
  
//palindrome check      
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
    public static void main(String args[]){
	Node head = null;
	head = addNode(head,1);
	head = addNode(head,2);
	head = addNode(head,3);
	head = addNode(head,2);
	head = addNode(head,1);

	System.out.println(isPalindrome(head));
    }
}
