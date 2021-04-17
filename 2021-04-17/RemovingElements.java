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
	    //if head is the val move the head to next node so that it removed
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
