//https://leetcode.com/problems/reverse-bits/
package leetCode_Easy_118;

public class ReverseBits {

	//to reverse the 32 bits
	
	//three main steps
	//assign a variable eg: result = 0;
	//then if the last bit of input is 1 then add the result and left shift the result
	//at last right shift the n 
	
	//method for reverseBits
	public static int reverseBits(int num) {
		
		int result = 0;
		for(int tempIndex = 0; tempIndex < 32; tempIndex++) {
			
			result <<= 1;
			
			if((num & 1) == 1) {
				result++;
			}
			
			num >>= 1;
		}
		return result;
	}
	
	//main function
	public static void main(String[] args) {
		
		int result = reverseBits(10);
		
		System.out.println(result);
	}
}
