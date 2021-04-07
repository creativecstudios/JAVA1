//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package Leetcode;
import java.util.Scanner;

//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4]

class RemoveDuplicateSortedArray{

	public static int removeDuplicateSortedArray(int[] arr){
		if(arr == null || arr.length == 0){
			return 0;
		}
		int pointer = 0;
		for(int tempIndex = 0; tempIndex < arr.length; ++tempIndex){
			if(arr[tempIndex] != arr[pointer]){
				arr[++pointer] = arr[tempIndex];
			}
		}
		return pointer+1;
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		Merge_Sorted_Array obj = new Merge_Sorted_Array();

		obj.inputArray(arr,size);

		System.out.println(removeDuplicateSortedArray(arr); 
	}
}