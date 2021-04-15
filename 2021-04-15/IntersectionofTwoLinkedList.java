class IntersectionofLinkedList {

	pubic Node intersectionofLinkedList(Node headA, Node headB) {
	
		Set<Node> visited = new Hashset<>();
		
		while(headA != null) {
			visited.add(headA);
			headA = headA.next;
		}	
		while(headB != null) {
			if(visited.contains(headB)){
				return headB;
			}
			headB = headB.next;
		}
		return null;
	}
}