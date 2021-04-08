https://leetcode.com/problems/plus-one/

package Leetcode;
import java.util.Scanner;

class PlusOne {

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]

	public static int[] PlusOne(int[] arr) {
		for(int tempIndex = arr.length-1; tempIndex>=0; tempIndex--) {
			if(arr[tempIndex] < 9){
				arr[tempIndex]++;
				return arr;
			}
			arr[tempIndex] = 0;
		}
		int result[] = new int[tempIndex.length+1];
		result[0] = 1;
		return result;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
//Mergesorted class calling for getting input of an array
		Merge_Sorted_Array obj = new Merge_Sorted_Array();
		obj.inputArray(arr,size);
//calling PlusOne static method
		System.out.println(PlusOne(arr));

	}
}