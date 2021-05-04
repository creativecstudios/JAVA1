//https://leetcode.com/problems/number-of-1-bits/

package leetCode_Easy_118;

public class Numberof1Bits {

	//number of 1 bits
	public static int NumberOf1bits(int n) {
		
		int count = 0;
		int mask = 1;
		for(int i = 0; i < 32; i++) {
			if( (n & mask) !=0) {
				count++;
			}
			mask <<= 1;
		}
		return count;
		
	}
//optimized approach
	public static int hammingWeight(int n) {
		int count = 0;
		
		while(n != 0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		int result = NumberOf1bits(000101);
		
		System.out.println(result);
	}
}
