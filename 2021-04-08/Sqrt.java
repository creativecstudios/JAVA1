//https://leetcode.com/problems/sqrtx/

package Leetcode;
import java.util.Scanner;

class Sqrt{

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.

	public static int mysqrt(int num){
		long start = 0; 
		long end = num;
		while(start + 1 < end){
			int mid = start + (end - start)/2;
			if(mid * mid == num){
				return(int)mid;
			}
			if(mid * mid > num){
				end = mid;
			}
			if(mid * mid < num){
				start = mid;
			}
		}
		if(end * end == num){
			return (int)end;
		}
		return (int)start;
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENter the sqrt num");
		int num = scanner.nextInt();
		System.out.println(mysqrt(num));
	}
}