//https://leetcode.com/problems/ransom-note/
package LeetCode383;

import java.util.HashMap;

public class RansomNote {

//	Example 1:
//
//		Input: ransomNote = "a", magazine = "b"
//		Output: false
//		Example 2:
//
//		Input: ransomNote = "aa", magazine = "ab"
//		Output: false
//		Example 3:
//
//		Input: ransomNote = "aa", magazine = "aab"
//		Output: true
	
	public static boolean Ransom(String ransom, String magazine) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : magazine.toCharArray()) {
			
			map.put(ch,map.getOrDefault(ch, 0)+1);
			
		}
		
		for(char ch : ransom.toCharArray()) {
			if(!map.containsKey(ch) || map.get(ch) <= 0) {
				return false;
			}
			map.put(ch,map.get(ch)-1);
		}
		return true;
		
	}
	//method 2
	public static boolean Ransom2(String ransom, String magazine) {
		
		int arr[] = new int[26];
		
		for(char ch : magazine.toCharArray()) {
			arr[ch - 97]++;
			
		}
		System.out.println();
		for(char ch : ransom.toCharArray()) {
			
			if(--arr[ch - 97] < 0) {
				
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		boolean result = Ransom2("aa","aa");
		
		System.out.println(result);
		
	}
}
