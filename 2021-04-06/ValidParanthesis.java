//https://leetcode.com/problems/valid-parentheses/submissions/

package Leetcode;
import java.util.Scanner;
class ValidParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the input String");
	//'(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	
	String input = scanner.nextLine();

	System.out.println(isValid(input));
	
    }
}