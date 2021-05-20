//https://leetcode.com/problems/longest-palindrome/
package LeetCode118;

import java.util.HashMap;

public class LongestPalindorme {

	
	
	//Find the Longest Palindrome of a string
	//Logic for even palindrome each letter will be repeated atleast 2 times
	//For odd there should be one uique char and other letters will repeated atleast 2 times
	// if the repeated letter count is even then consider as it is
	// if odd then make it even by subracting one from it.
	// at last print the count.
	
	//Pseudo Code
	//Begin
	//longestPalindrome(String s)
	//	HashMap<Character,Integer> map
	//	Declare boolean key = true
	//	Declare count = 0
	//	add characters of string and its default value to map and increase the count of each letter if repeated
	//	For (each ch : s.toCharArray())
	//	If map.get(ch) == 1 && key
	//		Then count++
	//		key = false
	//	EndIf
	//	Else If map.get(ch) % 2 == 0
	//		Then count + map.get(ch)
	//		map.put(ch,0)
	//	End ElseIF
	//	Else
	//		count + map.get(ch)-1
	//		map.put(ch,1)
	//	End Else
	//return count
	//End
	public static int longestPalindrome(String s) {
	
		boolean key = true;
		HashMap<Character,Integer> map = new HashMap<>();
		
		int count = 0;
		for(char ch : s.toCharArray()) {
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : s.toCharArray()) {
			
			if(map.get(ch) == 1 && key) {
				count++;
				key = false;
			}
			
			else if(map.get(ch) % 2 == 0) {
				count += map.get(ch);
				map.put(ch, 0);
			}
			else{
				count += map.get(ch) - 1;
				map.put(ch, 1);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int result = longestPalindrome("aabbcdb");
		
		System.out.println(result);
	}
}
