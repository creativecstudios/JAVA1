https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package Leetcode;

import java.util.Scanner;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static int evendigits(int arr[]) {
		//int arr[] = {234,12,121,2};
		int sum = 0;
		int result = 0;
		for(int primaryindex = 0; primaryindex <arr.length; primaryindex ++) {
			while(arr[primaryindex ]!=0) {
				arr[primaryindex] = arr[primaryindex]/10;
				sum++;
			}
			if(sum%2==0){
				result++;
			}

		}
		return result;
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
		
		System.out.println(evendigits(arr));
		
	}
}
