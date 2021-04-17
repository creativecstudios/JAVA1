//https://leetcode.com/explore/learn/card/linked-list/213/conclusion/1225/

class Flatten {
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