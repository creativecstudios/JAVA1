//https://leetcode.com/problems/3sum-closest/submissions/
package Leetcode;
import java.util.Scanner;
class Solution {
    public static int threeSumClosest(int[] arr, int target) {
       
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        
        Arrays.sort(arr);
        
        int closest = arr[0]+arr[1]+arr[2];
        
        for(int tempIdex=0; tempIndex<arr.length; tempIndex++){
            int start = tempIndex+1;
            int end = arr.length-1;
            while(start<end){
                int sum = arr[tempIndex]+arr[start]+arr[end];
                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    start++;
                }
                else{
                    end--;
                }
                
            }
        }
        return closest;
        
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	int size = scanner.nextInt();
	System.out.println("Enter the input size of array");
	int arr[] = new int[size];
	
	Merge_Sorted_Array obj = new Merge_Sorted_Array();
	obj.inputArray(arr,size);
	
	System.out.println("Enter the target element");
	int target = scanner.nextInt();
	threeSumClosest(int[] arr, int target);
    }
}