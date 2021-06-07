package Jp;
import java.util.Stack;

public class ValidParanthesis {

	public static boolean validparanthesis(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(char temp : str.toCharArray()) {
			
			if(temp == '(' || temp == '{' || temp == '[') {
				stack.push(temp);
			}
			
			else if(temp == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}
			else if(temp == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}
			else if(temp == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}
			else {
				return false;
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		
		String str = "({[]})";
		boolean result = validparanthesis(str);
		System.out.println(result);
	}
}
