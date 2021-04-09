//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class RemoveDuplicatesfromSortedList {

// Example 1:
// Input: head = [1,1,2]
// Output: [1,2]
    
// Example 2:
// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while(current != null && current.next!=null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}
