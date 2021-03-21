package Leetcode;
import java.util.Scanner;
public class Max_Consecutive_ones {
	
	void consecutivenum(int nums[]) {
		//arr[] = {0,1,1,0,1,1,1};
		        int max = 0;
		        int currentone = 0;
		        for(int primaryindex = 0; primaryindex <nums.length; primaryindex ++){
		            if(nums[primaryindex] == 1){
		                currentone +=1;
		                max = Math.max(max,currentone);
		            }
		            else{
		                currentone = 0;
		            }
		        }
		        System.out.println(max);
	}
	
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int length = scanner.nextInt();
		
		int arr[] = new int[length];
		
		System.out.println("Give the input elements");
		
		for(int inputIndex = 0; inputIndex<arr.length; inputIndex++) {
			arr[inputIndex] = scanner.nextInt();
		}
		
		Max_Consecutive_ones obj = new Max_Consecutive_ones();
		obj.consecutivenum(arr);
		
	}
}
