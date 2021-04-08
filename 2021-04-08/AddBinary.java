//https://leetcode.com/problems/add-binary/

package Leetcode;
import java.util.Scanner;

class AddBinary {

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"

	public static String addBinary(String str1,String str2){
		StringBuilder result = new StringBuilder();
		int sum = 0; 
		int carry = 0;

		int tempIndex1 = str1.length()-1;
		int tempIndex2 = str2.length()-1;
		
		while(tempIndex1>=0 || tempIndex >=0) {
			sum = carry;
			if(tempIndex1 >= 0){
				sum += sum + str1.charAt(tempIndex1--)-'0';
			}
			if(tempIndex2 >= 0){
				sum += sum + str2.charAt(tempIndex2--)-'0';
			}
			result.insert(0,sum % 2);
			carry = sum /2;
		}
		if(carry > 0){
			result.insert(0,1);
		}
		return result.toString();
 	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
//str1 input
		System.out.println("Input str1");
		String str1 = scanner.nextLine();
//str2 input
		System.out.println("Input str2");
		String str2 = scanner.nextLine();
//method calling
		System.out.println(addBinary(str1,str2));

	}
}