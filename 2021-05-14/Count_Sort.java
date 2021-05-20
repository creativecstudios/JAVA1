package SDE;

public class Count_Sort {

	//count sorting algorithm
	public static void countSort(int arr[],int k) {
		
		int count[] = new int[k];
		int output[] = new int[arr.length];
		//counting 
		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		//modify count arr
		for(int i = 1; i < count.length; i++) {
			count[i] = count[i-1] + count[i];
		}
		//build the output array
		for(int i = arr.length-1; i >= 0; i--) {
			output[--count[arr[i]]] = arr[i];
			
		}
		for(int i : output) {
			arr = output;
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	//main
	public static void main(String[] args) {
		
		int arr[] = {0,9,2,3,2,8,3,4,1};
		
		countSort(arr,10);
	}
}
