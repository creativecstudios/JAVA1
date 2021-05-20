//https://leetcode.com/problems/third-maximum-number/
package LeetCode118;

import java.util.Arrays;

import java.util.PriorityQueue;

public class ThirdMaximum {

	public static int Thirdmax(int nums[]) {
		
		PriorityQueue<Integer> set = new PriorityQueue<>();
		
		for(int temp : nums) {
			if(!set.contains(temp)) {
				set.add(temp);
				if(set.size() > 3) {
					break;
				}
			}
		}
		
		if(set.size() == 3) {
			return set.remove();
		}
		
		else {
			Arrays.sort(nums);
			return nums.length-1;
		}
	
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		int result = Thirdmax(arr);
		System.out.println(result);
	}
}
