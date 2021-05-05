// https://leetcode.com/problems/contains-duplicate/

package leetCode_Easy_118;

import java.util.HashSet;

public class ContainsDuplicate {
	
	public static boolean isContainDup(int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();
		for(int temp : arr) {
			if(set.contains(temp)) {
				return true;
			}
			else {
				set.add(temp);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		boolean result = isContainDup(arr);
		System.out.println(result);
	}
}
