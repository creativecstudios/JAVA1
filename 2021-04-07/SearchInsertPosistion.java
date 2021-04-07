//https://leetcode.com/problems/search-insert-position/submissions/

package Leetcode;
import java.util.Scanner;

//Input: nums = [1,3,5,6], target = 5
//Output: 2

//Input: nums = [1,3,5,6], target = 7
//Output: 4

class SearchInsertPosistion{
	public static int searchInsertPosistion(int arr[], int target){
		
		for(int = 0; i < arr.length; i++){
			if(arr[i] == target){
				return i;
			}
			else if(target < arr[i]){
				retutn i;
			}

		} 
		retutn i;
	}

	public satatic int searchInsertPos(int arr[], int target){
		int start = 0; 
		int end = arr.length-1;
		while(start<end){
			int mid = start + (end-start) / 2;
			if(target == arr[mid]){
				return mid;
			}
			if(arr[mid] < target){
				start = mid + 1;
			}
			if(arr[mid] > target){
				end = mid - 1;
			}
		}
	}

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = scanner.nextInt();
		int arr[] = new int(size);
//input array elements
		Merge_Sorted_Array obj = new Merge_Sorted_Array();
		obj.inputArray(arr,size);

		System.out.println("Enter the target value");
		int target = scanner.nextInt();

		searchInsertPosistion(arr,target);


	}
}