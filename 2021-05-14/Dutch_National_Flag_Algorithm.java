package SDE;

public class Dutch_National_Flag_Algorithm {

	//method to sort with Time complexityO(n) and Space complexity O(1)
	public static void sorting(int arr[]) {
		int start = 0, mid = 0;
		int end = arr.length-1;
		
		while(mid <= end) {
			switch(arr[mid]) {
			case 0:
				swap(arr,start++,mid++);
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr,mid,end--);
				break;
			}
		}
	}
	//swap
	public static void swap(int arr[],int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//print
	public static void print(int arr[]) {
		for(int temp : arr) {
			System.out.print(temp +" ");
		}
	}
	//main function
	public static void main(String[] args) {
		int arr[] = {1,1,0,2,0,0,2};
		sorting(arr);
		print(arr);
	}
}
