package Jp;

public class SearchRotatedSortedArray {
	
	public static int roatedSortedArray(int arr[],int target) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[start] <= arr[mid]) {
				if(target >= arr[start] && arr[mid] >= target) {
					end = mid -1;
				}else {
					start = mid +1;
				}
			}else {
				if(target >= arr[mid] && target <= arr[end]) {
					start = mid + 1;
				}else {
					end = mid -1;
				}
			}
		}
		return -1;
			
	}
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		int result = roatedSortedArray(arr,target);
		System.out.println(result);
	}

}
