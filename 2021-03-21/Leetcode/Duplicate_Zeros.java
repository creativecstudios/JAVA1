//https://leetcode.com/problems/duplicate-zeros/
package Leetcode;

import java.util.Scanner;

public class Duplicate_Zeros {
	public static void duplicateZeros(int[] arr) {
        int primaryindex=0;
        
        while(primaryindex<arr.length){
            
            if(arr[primaryindex]==0){
                for(int tempIndex=arr.length-1; tempIndex>primaryindex; tempIndex--){
                    arr[tempIndex] = arr[tempIndex-1];
                }
                if(primaryindex+1 >arr.length){
                    arr[primaryindex+1] = 0;
                }
                primaryindex++;
            }
            primaryindex++;
        }
        for(int dummyindex : arr) {
        	System.out.println(dummyindex);
        }
        
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
		
		duplicateZeros(arr);
}

	
}
