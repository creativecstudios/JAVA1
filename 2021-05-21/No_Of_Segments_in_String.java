//https://leetcode.com/problems/number-of-segments-in-a-string/
package LeetCode118;

public class No_Of_Segments_in_String {

//	You are given a string s, return the number of segments in the string. 
//
//			A segment is defined to be a contiguous sequence of non-space characters.
	
//			Example 1:
//
//			Input: s = "Hello, my name is John"
//			Output: 5
//			Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
//
//			Example 2:
//
//			Input: s = "Hello"
//			Output: 1
//
//			Example 3:
//
//			Input: s = "love live! mu'sic forever"
//			Output: 4
//
//			Example 4:
//
//			Input: s = ""
//			Output: 0

	//method 1
	public static int No_Of_Segments(String s) {
		
		int count = 0;
		
		for(int temp = 0; temp < s.length(); temp++) {
			
			if((temp == 0 || s.charAt(temp-1) == ' ') && s.charAt(temp) != ' ') {
				count++;
			}
		}
		return count;
	}
	
	//inbuilt method
	public static int No_Of_Segments1(String s) {
		
		String trim = s.trim();
		if(trim.equals("")) {
			return 0;
		}
		
		return trim.split("\\s+").length;
		
	}
	public static void main(String[] args) {
	
		int result = No_Of_Segments1("    ");
		
		System.out.println(result);
	}
}
