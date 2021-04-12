//https://leetcode.com/explore/learn/card/linked-list/209/singly-linked-list/1290/
package tree;

public class MyLinkedList {
	
	class Node{
		int val;
		Node next;
		public Node(int x){
			this.val = x;
			}
	}
	
	Node head = null;
	Node tail = null;
	int size = 0;
	
	public MyLinkedList() {
		head = new Node(0);
		tail = new Node(0);
		head.next = tail;
	}
	
	public int getIndex(int index) {
		if(index < 0 || index >= size) 
			return -1;
		Node temp = head;
		for(int i = 0; i <= index; i++) {
			temp = temp.next;
		}
		return temp.val;
	}
	
	public void addHead(int val) {
		addAtIndex(0,val);
	}
	public void addTail(int val) {
		addAtIndex(size,val);
	}
	public void addAtIndex(int index,int val) {
		if(index < 0 || index > size ) {
			return;
		}
		Node temp = head;
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		
		Node n = new Node(val);
		n.next = temp.next;
		temp.next = n;
		size ++;
	}
	public void deleteAtIndex(int index,int val) {
		if(index < 0 || index >=0) {
			return;
		}
		Node temp = head;
		for(int i = 0; i<=index; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		size --;
	}
	
	public static void main(String args[]) {
		MyLinkedList obj = new MyLinkedList();
		int input = obj.getIndex(2);
		obj.addAtIndex(0, 1);
		obj.addAtIndex(1, 2);
		obj.addAtIndex(2, 3);
		System.out.println(obj.getIndex(1));
	}

}
