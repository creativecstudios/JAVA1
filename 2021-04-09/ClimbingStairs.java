//https://leetcode.com/problems/climbing-stairs/

package Leetcode;
import java.util.Scanner;

class ClimbingStairs {
	public static int climbingStairs(int num) {
		int steps[] = new int[num+1];
		steps[0] = 1;
		steps[1] = 1;
		for(int tempIndex = 2; tempIndex <= num; tempIndex++){
			steps[tempIndex] = steps[tempIndex-1] + steps[tempIndex-2];
		}
		return steps[num];
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the steps");
		int num = scanner.nextInt();
		System.out.println("No of distinct ways to cover the steps is");
		System.out.println(climbingStairs(num));
	}
}

