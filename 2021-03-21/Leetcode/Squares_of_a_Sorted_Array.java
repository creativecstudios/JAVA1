//https://leetcode.com/problems/squares-of-a-sorted-array/
package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_Sorted_Array {

	public static int[] squaresort(int arr[]) {
		//int arr[] = {2,32,9,3};
		//OUTPUT = 4,9,81,1024;
		
		int sort[] = new int[arr.length];
		for(int tempindex = 0; tempindex < arr.length; tempindex++) {
			arr[tempindex] = arr[tempindex] * arr[tempindex];
		}
		Arrays.sort(arr);
		return arr;
	}
	
public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int length = scanner.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Give the input elements");
		
		for(int inputIndex = 0; inputIndex<arr.length; inputIndex++) {
			arr[inputIndex] = scanner.nextInt();
		}
		
		System.out.println(squaresort(arr));
}
}
