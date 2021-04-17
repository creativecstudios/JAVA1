//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/

pacakage tree;

class OddEvenList {
//Node class
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