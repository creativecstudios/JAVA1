//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/

pacakage tree;

class OddEvenList {
//Node class
	
// Example 1:	
// Input: head = [1,2,3,4,5]
// Output: [1,3,5,2,4]
	
// Example 2:
// Input: head = [2,1,3,5,6,4,7]
// Output: [2,3,6,7,1,5,4]
	
    static class Node {
	static int val;
	Node next;
	Node(int x){
		this.val = x;
	}
    }
    Node head = null;

//AddNode
    public static addNode(Node head,int val){
	Node n = new Node(val);
	n.next = head;
	head = n;
	return head;
    }

//oddeven method	
    public static Node oddEvenList(Node head) {
    
        if(head == null){
            return null;
        }
        Node odd = head;
        Node even = head.next;
        Node evenhead = even;
        
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }

//main method
    public static void main(String args[]){
	Node head = null;
	head = addNode(head,1);
	head = addNode(head,2);
	head = addNode(head,3);
	head = addNode(head,4);
	head = addNode(head,5);

	oddEvenList(head);

    }	
    
}
