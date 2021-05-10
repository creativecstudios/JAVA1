//https://leetcode.com/problems/range-sum-query-immutable/
package leetCode_Easy_118;


public class RangeSumQueryImmutable {

	//pseudo code
	//Begin
	//Declare arr[]
	//Input arr[]
	//Declare sum = 0
	//Declare left,right
	//Input left,right
	//For i = left to right Increament i
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
	
	public static void main(String args[]) {
		int arr[] = {1,3,13,1,3,24};
		numarr(arr);
		int result = sum(0,2);
		System.out.println(result);
	}
	
}
