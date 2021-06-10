package Jp;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class ThreeSum {

	public static List<List<Integer>> threeSum(int arr[],int target){
		
		Arrays.sort(arr);
		//-4,-1,-1,0,1,2
		List<List<Integer>> result = new ArrayList<>();
		
		
		
		for(int temp = 0; temp < arr.length; temp++) {
		
			int end = arr.length-1;
			int start = temp + 1;
			
			if(temp > 0 && arr[temp-1] == arr[temp]) {
				continue;
			}
			
			while(start < end) {
				
				if(end < arr.length-1 && arr[end] == arr[end+1]) {
					end--;
					continue;
				}
				
				if(arr[temp] + arr[start] + arr[end] == target) {
					List<Integer> dummy = Arrays.asList(arr[temp],arr[start],arr[end]);
					result.add(dummy);
					start++;
					end--;
				}
				
				else if(arr[temp] + arr[start] + arr[end] < target) {
					start++;
				}
				else {
					end--;
				}
				
				
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		int arr[] = {-1,0,1,2,-1,-4};
		int target = 0;
		List<List<Integer>> result = threeSum(arr,target);
		System.out.println(result);
		
	}
}
