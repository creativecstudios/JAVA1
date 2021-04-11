//https://leetcode.com/problems/valid-palindrome/

package Leetcode;
import java.util.Scanner;

class ValidPalindrome{

// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.


	public static boolean isPalindrome(String str){
		int start = 0;
		int end = str.length()-1;
		while(start < end){

			while(start < end && !Character.isLetterOrDigit(str.charAt(start))){
				start++;
			}
			while(start < end && !Character.isLetterOrDigit(str.charAt(end))){
				end--;
			}
			if(start < end && Character.toLowerCase(str.charAt(start++)) != Character.toLowerCase(str.charAt(end--))){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the string for palindrome");
		String input = scanner.nextLine();
		System.out.println(isPalindrome(input));
	}
}
