//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
package LeetCode118;

public class Minimum_moves_to_equal_array_elements {

//	Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
//
//			In one move, you can increment n - 1 elements of the array by 1.
//
//			Example 1:
//
//			Input: nums = [1,2,3]
//			Output: 3
//			Explanation: Only three moves are needed (remember each move increments two elements):
//			[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
//
//			Example 2:
//
//			Input: nums = [1,1,1]
//			Output: 0

	public static int makeEqual(int arr[]) {
		
		int min = arr[0];
		int mincount = 0;
		
		for(int temp : arr) {
			
			min = Math.min(temp, min);
			
			mincount += temp;
			
		}
		return mincount - arr.length * min;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		
		int result = makeEqual(arr);
		
		System.out.println(result);
	}
	
}
