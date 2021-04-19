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
		static int size = 1;
	//addNode	
		public static Node AddNode(Node head, int val){
			Node n = new Node(val);
			n.next = head;
			head = n;
			return head;
		}
	    
		//addNodemethod2
		public static Node addNode(int pos,int val) {
			if(pos < 0 || pos > size) {
				return null;
			}
			Node temp = head;
			int count = 1;
			while(count < pos) {
				temp = temp.next;
				count ++;
			}
			Node n = new Node(val);
			n.next = temp.next;
			temp.next = n;
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
	        System.out.println(head.val);
	        return head;
	    }



	//MAIN FUNCTION 
	    public static void main(String args[]){
	    	Node head = null;
		head = AddNode(head,2);
		head = AddNode(head,2);
		head = AddNode(head,3);
		head = AddNode(head,2);
		head = AddNode(head,4);
		head = AddNode(head,2);
	    
//	    	addNode(1,2);
//	    	addNode(2,1);
//	    	addNode(3,2);
//	    	addNode(4,3);
//	    	addNode(5,4);
	    	

		System.out.println(removeElements(head,2));


    }
}
