//https://leetcode.com/problems/is-subsequence/
package LeetCode383;

public class IsSubsequence {

	public static boolean isSubsequence(String s, String t) {

		for (int i = 0; i < s.length(); i++) {

			int index = t.indexOf(s.charAt(i));
			System.out.println(index);
			if (index == -1)
				return false;
			t = t.substring(index + 1);

		}

		return true;

	}
	//method 2 two pointer technique
	public static boolean isSubsequence2(String s, String t) {
		
		int spointer = 0;
		int tpointer = 0;
		
		while(tpointer < t.length()) {
			if(t.charAt(tpointer) == s.charAt(spointer)) {
				spointer++;
				if(spointer == s.length()) {
					return true;
				}
			}
			tpointer++;
		}
		return false;
		
	}
	public static void main(String[] args) {
	
		boolean result = isSubsequence("acb","abcbh");
		System.out.println(result);
		
	}
	
}
