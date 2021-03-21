package Leetcode;

import java.util.Scanner;

public class Merge_Sorted_Array {

	public static void merge(int[] nums1, int arr1len, int[] nums2, int arr2len) {
        int pos1 = arr1len - 1;
        int pos2 = arr2len - 1; 
        int indx = arr1len + arr2len - 1;
        
        while(pos2>=0){
            if(pos1>=0 && (nums1[pos1]> nums2[pos2]) ){
                nums1[indx--] = nums1[pos1--];
            }
            else{
                nums1[indx--] = nums2[pos2--];
            }
        }
        
        for(int tempindex : nums1) {
        	System.out.println(tempindex);
        }   
    }
	
	public static void main(String args[]) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the size of the array1");
			int arr1length = scanner.nextInt();
			
			//array 1
			System.out.println("Give the input elements for array 1");
			int arr1[] = new int[arr1length];
			for(int inputIndex = 0; inputIndex<arr1.length; inputIndex++) {
				arr1[inputIndex] = scanner.nextInt();
			}
			
			System.out.println("Enter the size of the array2");
			int arr2length = scanner.nextInt();
			
			//array 2
			System.out.println("Give the input elements for array 2");
			int arr2[] = new int[arr2length];
			for(int inputIndex = 0; inputIndex<arr2.length; inputIndex++) {
				arr2[inputIndex] = scanner.nextInt();
			}
			
			//method calling
			merge(arr1,arr1length,arr2,arr2length);
			
	}
}
