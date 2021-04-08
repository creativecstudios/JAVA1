https://leetcode.com/problems/maximum-subarray/submissions/

package Leetcode;
import java.util.Scanner;

//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6

//Input: nums = [5,4,-1,7,8]
//Output: 23

//Input: nums = [1]
Output: 1

class MaxSubArray {
    public static int maxSubArray(int[] nums) {
       // int table[] = new int[nums.length];
        
        
        int max = nums[0];
        int currentsubarray = nums[0];
        
        if(nums.length-1 == 0){
            return max;
        }
        for(int tempIndex = 1; tempIndex < nums.length; tempIndex++){
		//comparing the currentelement of the array with maximum value found in the previous subarray
            currentsubarray = Math.max(nums[i], nums[i]+ currentsubarray);
		//obtaining the max value from currentsubrray max and maximumvalue stored in max
            max = Math.max(max,currentsubarray);
        }
        return max;
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size = scanner.nextInt();
	    //array declaration
	int arr[] = new int[size];
	    //geting input elements for an array from mergesorted class by creating an object
	Merge_Sorted_Array obj = new Merge_Sorted_Array();
	    //calling the inputryarrayt method form mergesorted class
	obj.inputArray(arr,size);
	    //printing the max sub array output
	System.out.println(MaxSubArray(arr));
    }	
}
