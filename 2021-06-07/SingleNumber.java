package Jp;

import java.util.HashMap;

//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4

public class SingleNumber {
	
	public static int singleNumber(int arr[]) {

		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int temp : arr) {
			map.put(temp, map.getOrDefault(temp,0)+1);
		}
		
		for(int temp : arr) {
			if(map.get(temp) == 1) {
				return temp;
			}
		}
		return 0;	
	}
	public static void main(String[] args) {
		int arr[] = {4,1,2,1,2};
		
		int result = singleNumber(arr);
		
		System.out.println(result);
		
	}

}
