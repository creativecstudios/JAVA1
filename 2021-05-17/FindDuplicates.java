package SDE;

public class FindDuplicates {

//	Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//	There is only one repeated number in nums, return this repeated number.
//
//	You must solve the problem without modifying the array nums and uses only constant extra space.
	
	//Pseudo Code
	//use linked list fast and slow pointer technique for traversing
	
	public static int findDuplicate(int arr[]) {

		int slow = arr[0];
		int fast = arr[0];
		
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		}while(slow != fast);
		
		arr[slow] = 0;
		while(slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}
		
		return slow;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {1,3,4,2,2};
		
		int result = findDuplicate(arr);
		
		System.out.println(result);
				
	}
}
