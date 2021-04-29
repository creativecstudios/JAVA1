//https://leetcode.com/problems/single-number/

package leetCode_Easy_118;
import java.util.List;
import java.util.ArrayList;

public class SingleNUmber {

//		Example 1:
//		Input: nums = [2,2,1]
//		Output: 1
//		
//		Example 2:
//		Input: nums = [4,1,2,1,2]
//		Output: 4
//		
//		Example 3:
//		Input: nums = [1]
//		Output: 1
	//singleNumber
	public static int singleNumber(int arr[]) {
		
		List<Integer> result = new ArrayList<>();
		
		for(int i: arr) {
			if(!result.contains(i)) {
				result.add(i);
			}
			else{
				result.remove(new Integer(i));
			}
		}
		return result.get(0);
	}
	
	public static void main(String args[]) {
		
		int arr[] = {2,2,1,4,4};
		
		int result = singleNumber(arr);
		System.out.println(result);
		
	}
}
