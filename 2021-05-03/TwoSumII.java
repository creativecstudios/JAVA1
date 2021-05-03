//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

package leetCode_Easy_118;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

	//towsumII
	public static int[] twoSum(int arr[],int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int answer[] = new int[2];
		for(int i= 0; i < arr.length; i++) {
			int difference = target - arr[i];
			if(map.containsKey(difference)) {
				answer[1] = i+1;
				answer[0] = map.get(difference);
			}
			map.put(arr[i], i+1);
		}
		return answer;
	}
	public static void main(String args[]) {
		int arr[] = {2,7,10,11,15};
		int target = 9;
		int[] result = twoSum(arr,target);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}
}
