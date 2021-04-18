//https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1225/

class Flatten {
    
// Example 1:
// Input: head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
// Output: [1,2,3,7,8,11,12,9,10,4,5,6]
    
// Example 2:
// Input: head = [1,2,null,3]
// Output: [1,3,2]
// Explanation:
// The input multilevel linked list is as follows:

//   1---2---NULL
//   |
//   3---NULL
      
// Example 3:
// Input: head = []
// Output: []
    
    public Node flatten(Node head) {
        
        Node temp = head;
        Stack<Node> stac = new Stack<>();
        
        while(head != null){
            if(head.child != null){
                if(head.next != null) stac.push(head.next);
                head.next = head.child;
                head.next.prev = head;
                head.child = null;
            }
            
            else if(head.next == null && !stac.isEmpty()){
                head.next = stac.pop();
                head.next.prev = head;
            }
            
            head = head.next;
        }
        return temp;
    }
}
