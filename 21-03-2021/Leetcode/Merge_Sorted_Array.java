package Leetcode;

import java.util.Scanner;

public class Merge_Sorted_Array {

	static Scanner scanner1 = new Scanner(System.in);
	
	//printing function 
	public static void printresult(int nums1[]) {
		 for(int tempindex : nums1) {
       		System.out.println(tempindex);
       	}  
	}
	
	//input function
	public static void inputArray(int arr[],int size) {
		int arr1[] = new int[size];
		System.out.println("Give the input elements for array");
		for(int inputIndex = 0; inputIndex<arr1.length; inputIndex++) {
			arr[inputIndex] = scanner1.nextInt();
		}
		
	}

	//mergesort function
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
        printresult(nums);
        
    }
	
	public static void main(String args[]) {
			
			Scanner scanner = new Scanner(System.in);
			
			//array1
			System.out.println("Enter the size of the array1");
			int arr1length = scanner.nextInt();
			int arr1[] = new int[arr1length];
			inputArray(arr1,arr1length);
			
			//array2
			System.out.println("Enter the size of the array2");
			int arr2length = scanner.nextInt();
			int arr2[] = new int[arr2length];
			inputArray(arr2,arr2length);
			
			//method calling
			merge(arr1,arr1length,arr2,arr2length);
			
	}
}
