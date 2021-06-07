package Jp;

public class ValidPalindrome {

	public static boolean validPalindrome(String str) {
		
		int start = 0;
		int end = str.length()-1;
		
		while(start < end) {
			while(start < end && !Character.isLetterOrDigit(str.charAt(start))) {
				start++;
			}
			while(start < end && !(Character.isLetterOrDigit(str.charAt(end)))) {
				end--;
			}
			if(start < end && Character.toLowerCase(start++) != Character.toLowerCase(end--)) {
				return false;
			}
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		String str = "race a car";
		boolean result = validPalindrome(str);
		System.out.println(result);
		
		boolean res = !Character.isLetterOrDigit(str.charAt(0));
		System.out.println(res);
	}
}
