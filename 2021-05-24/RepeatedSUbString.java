//https://leetcode.com/problems/repeated-substring-pattern/
package LeetCode118;

public class RepeatedSUbString {

	public static boolean repeatedSubString(String input) {
		
		String str = input + input;
		String temp = str.substring(1,str.length()-1);
		return temp.contains(input);
	}
	
	public static void main(String[] args) {
		
		boolean result = repeatedSubString("ababc");
		
		System.out.println(result);
	}
}
