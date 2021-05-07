//https://leetcode.com/problems/valid-anagram/
package leetCode_Easy_118;

import java.util.Arrays;

public class Anagram {

	//method1 sorting
	public static boolean anagram(String str1,String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] temp1 = str1.toCharArray();
		char[] temp2 = str2.toCharArray();
		
		Arrays.sort(temp1);
		Arrays.sort(temp2);
		
		str1 = temp1.toString();
		str2 = temp2.toString();
		
		if(str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
	}
	//method2 count
	public static boolean anagram2(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i< str1.length(); i++) {
			char current = str1.charAt(i);
			
			for(int j = 0; j < str2.length(); j++) {
				if(str2.charAt(j) == current) {
					count1++;
				}
			}
			for(int k = 0; k < str1.length(); k++){
				if(str1.charAt(k) == current) {
					count2++;
				}
			}
			
		}
		if(count1 != count2){
			return false;
		}
		else {
			return true;
		}
	}

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "naagram";
		
		boolean result = anagram(str1,str2);
		boolean result1 = anagram2(str1,str2);
		System.out.println(result1);
		
		System.out.println(result);
		
		int arr = 'm'-'a';
		System.out.println(arr);
	}
}
