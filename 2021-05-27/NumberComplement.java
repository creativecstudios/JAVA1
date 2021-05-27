//https://leetcode.com/problems/number-complement/
package LeetCode118;

public class NumberComplement {

	
	public static int complement(int num) {
		
		String str = Integer.toBinaryString(num);
		StringBuilder result = new StringBuilder();
		
		for(char ch : str.toCharArray()){
			result.append(ch  == '1' ? 0 : 1);
		}
		return Integer.parseInt(result.toString(),2); 
	}
	
	public static void main(String[] args) {
		
		int result = complement(5);
		
		System.out.println(result);
	}
}
