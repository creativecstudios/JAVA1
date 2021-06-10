package Jp;

import java.util.Arrays;

public class FindFirstLastPosofArray {

	public static int[] findfirstlastposofarray(int arr[],int target) {
		
		int first = pos(arr,target,true);
		int last = pos(arr,target,false);
		int result[] = new int[2];
		result[0] = first;
		result[1] = last;
		return result;
	}
	public static int pos(int arr[],int target, boolean state) {
		int indx = -1;
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(arr[mid] == target) {
				indx = mid;
				if(state) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
			else if(arr[mid] >= target) {
				end = mid-1;
			}
			else {
				start = mid + 1;
			}
		}
		return indx;
	}
	public static void main(String[] args) {
		int arr[] = {5,7,7,8,8,10};
		int result[] = findfirstlastposofarray(arr,8);
		
		System.out.println(Arrays.toString(result));
	}
}
