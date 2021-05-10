//https://leetcode.com/problems/range-sum-query-immutable/
package leetCode_Easy_118;


public class RangeSumQueryImmutable {

	//pseudo code
	//Begin
	//Declare arr[]
	//Input arr[]
	//Declare sum = 0
	//Initialize i = 0;
	//For i 0 to arr.length
	//sum = sum + arr[i]
	//End For
	//End
	
	static private int arr[];
	
	public static void numarr(int nums[]) {
		arr = nums;
	}
	
	public static int sum (int left,int right) {
		int sum = 0;
		for(int temp = left; temp <= right; temp++) {
			sum += arr[temp];
		}
		return sum;
	}
	//method two
	static private int sum[];

	public static void numarr1(int nums[]) {
		sum = new int[nums.length + 1];
		for(int i = 0; i < nums.length; i++) {
			sum[i+1] = sum[i]+nums[i];
		}
	}

	public static int sum1(int left,int right) {
		return sum[right + 1] - sum[left];
	}
	
	public static void main(String args[]) {
		int arr[] = {1,3,13,1,3,24};
		numarr(arr);
		int result = sum(0,2);
		System.out.println(result);
	}
	
}
