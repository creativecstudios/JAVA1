//https://leetcode.com/problems/ugly-number/
package leetCode_Easy_118;

public class UglyNumber {

	//uglyNumber
	public static boolean ugly(int num) {
		if(num <= 0) {
			return false;
		}
		
		while(true) {
			if(num % 2 == 0) {
				num /= 2;
			}
			else if(num % 3 == 0) {
				num /= 3;
			}
			else if(num % 5 == 0) {
				num /= 5;
			}
			else {
				break;
			}
			
		}
		if(num > 1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		boolean result = ugly(6);
		
		System.out.println(result);
	}
}
