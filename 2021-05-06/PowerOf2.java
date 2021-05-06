//https://leetcode.com/problems/power-of-two/
package leetCode_Easy_118;

public class PowerOf2 {

	//power of 2
	public static boolean power(int n) {
		long result = 1;
		while(result < n) {
			result *= 2;
		}
		
		return result == n;
	}
	
	public static void main(String[] args) {
		
		boolean result = power(16);
		
		System.out.println(result);
	}
}
