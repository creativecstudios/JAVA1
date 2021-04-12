package tree;



public class Cycle {

		int val;
		Cycle next;
		Cycle(int x ){
			this.val = x;
		}
 
	public static boolean hasCycle(Cycle head) {
		if(head == null) {
			return false;
		}
		Cycle slow = head;
		Cycle fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			head = head.next.next;
		}
		return true;
	}
	public static void main(String args[]) {
		Cycle head = new Cycle(2);
		Cycle b = new Cycle(2);
		Cycle c = new Cycle(3);
		Cycle d = new Cycle(4);
		Cycle z = new Cycle(5);
		 head.next = b;
		 b.next = c;
		 c.next = d;
		 d.next = z;

		System.out.println(hasCycle(head));
		
		
	}
}
