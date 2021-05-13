//https://leetcode.com/problems/find-the-difference/

package LeetCode383;
import java.util.HashMap;

public class FindTheDifference {

//	Example 1:
//
//		Input: s = "abcd", t = "abcde"
//		Output: "e"
//		Explanation: 'e' is the letter that was added.
//		Example 2:
//
//		Input: s = "", t = "y"
//		Output: "y"
//		Example 3:
//
//		Input: s = "a", t = "aa"
//		Output: "a"
//		Example 4:
//
//		Input: s = "ae", t = "aea"
//		Output: "a"

	public static char newlyAddedchar(String str1, String str2) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : str1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : str2.toCharArray()) {
			if(!map.containsKey(ch) || map.get(ch) <= 0) {
				return ch;
			}
			map.put(ch, map.get(ch)-1);
		}
		return '.';
	}
	
	public static void main(String[] args) {
		
		char result = newlyAddedchar("abab","ababe");
		
		System.out.println(result);
	}
}
