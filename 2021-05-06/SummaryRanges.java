//https://leetcode.com/problems/summary-ranges/

package leetCode_Easy_118;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	//Example 1:
	//Input: nums = [0,1,2,4,5,7]
	//Output: ["0->2","4->5","7"]
	//Explanation: The ranges are:
	//[0,2] --> "0->2"
	//[4,5] --> "4->5"
	//[7,7] --> "7"
	
	//Example 2:
	//Input: nums = [0,2,3,4,6,8,9]
	//Output: ["0","2->4","6","8->9"]
	//Explanation: The ranges are:
	//[0,0] --> "0"
	//[2,4] --> "2->4"
	//[6,6] --> "6"
	//[8,9] --> "8->9"
	
	//Example 3
	//Input: nums = []
	//Output: []
	
	//Example 4:
	//Input: nums = [-1]
	//Output: ["-1"]
	
	//Example 5:
	//Input: nums = [0]
	//Output: ["0"]

	//summary Ranges
	public static List<String> summaryRanges(int arr[]){
		List<String> result = new ArrayList<>();
		if(arr.length == 0 || arr == null) {
			return result;
		}
		int start = 0;
		int end = 1;
		
		while(end < arr.length) {
			while(end < arr.length && arr[end-1] == arr[end]-1) {
				end++;
			}
			
			if(start == end-1) {
				result.add(arr[start]+"");
			}
			else {
				result.add(arr[start]+"->"+arr[end-1]);
			}
			
			if(end < arr.length) {
				start = end;
			}
			end++;
		}
		if(start == end-1) {
			result.add(arr[start]+"");
		}
		return result;
	}
	
	//mainfunction
	public static void main(String[] args) {
		
		List<String> result = new ArrayList<>();
		
		int arr[] = {0,2,3,4,5,7};
		
		result = summaryRanges(arr);
		
		System.out.println(result);
	}
}










