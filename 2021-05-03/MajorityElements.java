//https://leetcode.com/problems/majority-element/
package leetCode_Easy_118;

public class MajorityElement {

//	The majority element is the element that appears more than ⌊n / 2⌋ times. 
//	You may assume that the majority element always exists in the array.
//
//	Example 1:
//	Input: nums = [3,2,3]
//	Output: 3
//	
//	Example 2:
//	Input: nums = [2,2,1,1,1,2,2]
//	Output: 2
	
	//Majotityelement
	public static int majorityElement(int arr[]) {
		
		Integer current = null;
		int count = 0;
		
		for(int tempIndex : arr) {
			if(count == 0) {
				current = tempIndex;
			}
			count += current == tempIndex ? 1 : -1;
		}
		return current;
	}
	//main method
	public static void main(String[] args) {
		int arr[] = {1,2,2,1,2};
		System.out.println(majorityElement(arr));
	}
}
