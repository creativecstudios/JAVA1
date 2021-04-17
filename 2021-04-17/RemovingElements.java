//https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1207/

package tree;

class RemoveElements {

//NODE CLASS
    static class Node {
	static int val;
	Node next;

	Node(int x){
		this.val = x;
	}
    }

	Node head = null;
	
	public static Node AddNode(Node head, int val){
		Node n = new Node(val);
		n.next = head;
		head = n;
		return head;
	}
    

//REMOVE ELEMENTS METHOD
    public static Node removeElements(Node head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        
        Node currentNode = head;
        
        while(currentNode != null && currentNode.next != null){
            if(currentNode.next.val == val){
                currentNode.next = currentNode.next.next;
            }
            else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }



//MAIN FUNCTION 
    public static void main(String args[]){
	Node head = null;
	head = addNode(head,1);
	head = addNode(head,2);
	head = addNode(head,3);
	head = addNode(head,2);
	head = addNode(head,4);
	head = addNode(head,5);

	removeElements(head,2);

    }
}