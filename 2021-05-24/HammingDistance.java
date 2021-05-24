//https://leetcode.com/problems/hamming-distance/
package LeetCode118;

public class HammingDistance {

	
	//Logic
	//check the last bit of each number and do OR operation.
	//Right shift the number until it become 0
	
	
	public static int HammingDistance(int x, int y) {
		
		int result = 0;
		
		while(x > 0 || y > 0) {
			
			result += (x % 2) ^ (y % 2);
			
			x >>= 1;
			y >>=1;
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int result = HammingDistance(4,1);
		
		System.out.println(result);
	}
}
