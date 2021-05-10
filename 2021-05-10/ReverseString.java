//https://leetcode.com/problems/reverse-string/
package leetCode_Easy_118;

public class ReverseString {

	//pseudo Code
	//tow pointer technique
	//Begin
	//Output ("input char array")
	//Input char[] s
	//Declare start = 0 , end = s.length-1
	//While start < end
	//	Declare char temp
	//	temp = s[start]
	//	s[start++] = s[end]
	//	s[end--] = temp
	//End while
	//To print the reverse String
	//For (char ch : s)
	//	print ch
	//End For
	//Stop
	
	//ReverseString
	public static void reverseString(char[] s) {
		
		String str = String.valueOf(s);
		
		StringBuffer reverse = new StringBuffer(str);
		
		reverse.reverse();
		String result = reverse.toString();
		char arr[] = result.toCharArray();
		for(char i: arr ) {
			System.out.print(i+" ");
		}
		System.out.println(result);
		
	}
	
	//method 2
	public static void reverseString1(char[] s) {
		int start = 0;
		int end = s.length-1;
		while(start < end) {
			char temp = s[start];
			s[start++] = s[end];
			s[end--] = temp;
		}
		for(char ch : s) {
			System.out.print(ch+" ");
		}
	}
	public static void main(String[] args) {
		
		char arr[] = {'h','e','l','l','o'};
		reverseString1(arr);
	}
}
