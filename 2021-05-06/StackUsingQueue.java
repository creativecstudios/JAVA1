//https://leetcode.com/problems/implement-stack-using-queues/

package leetCode_Easy_118;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList();
	Queue<Integer> q2 = new LinkedList();

	int top = 0;
	
	public void push(int x) {
		q2.add(x);
		top = x;
		
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public int pop() {
		int val =  q1.peek();
		if(!q1.isEmpty()) {
			top = q1.peek();
		}
		
		return val;
	}
	
	public int top() {
		return q1.peek();
	}
	
	public boolean empty() {
		return q1.isEmpty();
	}
	
	public static void main(String[] args) {
		StackUsingQueue obj = new StackUsingQueue();
		
		obj.push(2);
		obj.push(3);
		obj.push(4);
		
		int result = obj.pop();
		System.out.println(result);
	}
}
