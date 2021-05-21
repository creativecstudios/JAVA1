//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package LeetCode118;
import java.util.List;
import java.util.ArrayList;

public class Find_all_numbers_Dissappeared_in_a_array {

//	Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//			Example 1:
//
//			Input: nums = [4,3,2,7,8,2,3,1]
//			Output: [5,6]
//
//			Example 2:
//
//			Input: nums = [1,1]
//			Output: [2]

	public static List<Integer> dissappear(int arr[]){
		
		List<Integer> list = new ArrayList();
		
		boolean bool[] = new boolean[arr.length];
		
		for(int temp : arr) {
			
			bool[temp-1] = true;
		}
		
		for(int temp = 0; temp < arr.length; temp++) {
			
			if(!bool[temp]) {
				list.add(temp+1);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1};
		List<Integer> list = dissappear(arr);
		
		System.out.println(list);
	}
}
