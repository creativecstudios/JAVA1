https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1296/

package tree;

class RemoveNthNode {

    static class Node{
	
	int val;
	Node next;
	Node(int x){
		this.val = x;
	}

    Node head = null;

    //add Node

    public static Node addNode(Node head,int val){
	Node n = new Node(val);
	n.next = head;
	head = n;
	return head;	
    
    }	

    // Remove Nth Node
	
    public ListNode removeNthFromEnd(Node head, int n) {
        Node dummy = new ListNode(0);
        dummy.next = head;
        
        Node slow = dummy;
        Node fast = dummy;
        
        for(int i = 1; i <= n+1; i++){
            
                fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }   

    //main class

    public static void main(String args[]) {
	Node head = null;
	
	head = addNode(head,1);
	head = addNode(head,2);
	head = addNode(head,3);
	head = addNode(head,4);
	head = addNode(head,5);
	head = addNode(head,6);

       	System.out.println(removeNthFromEnd(head, 5));

	

    }   
}
