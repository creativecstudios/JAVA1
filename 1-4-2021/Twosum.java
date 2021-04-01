package Leetcode;

import java.util.Scanner;
import java.util.HashMap;

public class Twosum {
	
	//twosum
	public void twoSummethod1(int arr[],int target) {
		for(int tempindex = 0; tempindex<arr.length; tempindex++) {
			for(int tempindex2 = 1; tempindex2<arr.length; tempindex2++) {
				if(arr[tempindex]+arr[tempindex2] == target) {
				System.out.println(tempindex+" "+tempindex2);			
				}
			}
			break;
		}
	}
	
	//HashMap method
	public int[] twoSumMethod2(int arr[],int target) {
		int tempArr[] = new int[2];
		Map<Integer,Integer> result = new HashMap<Integer,Integer>();
		for(int tempIndex = 0; tempIndex < arr.length; tempIndex++) {
			int difference = target - arr[tempIndex];
			if(result.containsKey(difference)) {
				tempArr[0] = tempIndex;
				tempArr[1] = result.get(difference);
				return tempArr;
			}
			result.put(arr[tempIndex], tempIndex);
		}
		return tempArr;
	}

	//By using above method it consumes more time and memory to reduce 
	// we switch for HashMap or sets.
	
	
	
	//main function...
	public static void main(String args[]) {  
		
		Mergesorted ref = new Mergesorted();
		Scanner scanner = new Scanner(System.in);
		
		//array input
		System.out.println("Enter the length of the array");
		int size = scanner.nextInt();
		
		//array size
		int arr[] = new int[size];
		
		//re-using the input method form mergesorted class
		ref.inputArray(arr, size);

		//target element
		System.out.println("Target element");
		int target = scanner.nextInt();
		
		
		//general method logic for two sum....
		Twosum obj = new Twosum();
		obj.twoSummethod1(arr, target);
		
		//by using HashMap .....
		obj.twoSumMethod2(arr, target);
		
	
		
		//print array
		//ref.printresult(arr);
	}
}
