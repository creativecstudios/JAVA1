package Dummy;


import java.util.HashMap;
import java.util.Map;

public class Twosum {

	public static int[] twoSum(int arr[], int target) {
		
		int result[] = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			int difference = target - arr[i];
			
			if(!map.containsKey(difference)) {
				map.put(arr[i],i);
			}
			
			if(map.containsKey(difference)) {
				
				result[0] = i;
				result[1] = map.get(difference);
			}
			
		}
		for(int i : result) {
			System.out.print(i+" ");
		}
		return result;
	}
	public static void main(String[] args) {
		
		int arr[] = {2,7,11,15};
		
		int target = 9;
		
		//twoSum(arr,target);
		
		System.out.println(26 >>> 4);
	}
}
