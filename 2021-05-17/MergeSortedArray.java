package SDE;

import java.util.Arrays;

public class MergeSortedArray {

//------------------------------------------------------------------------------
//method1 using extra array
//------------------------------------------------------------------------------

	//Pseudo Code
	
	//Begin
	//Merge_sorted_Array(arr1[],arr2[])
	//Duplicatearr[] = sizeof(arr1) + sizeof(arr2)
	//Declare j = 0
	//For i From 0 to sizeof(Duplicatearr) i++
	//	If(i < arr1.length)
	//		Duplicatearr[i] = arr1[i];
	//	EndIf
	//	Else
	//		Duplicatearr[i] = arr2[j++]
	//	End Else
	//End For
	// j = 0
	//Sort Duplicatearr
	//For i From 0 to sizeof(Duplicatearr) i++
	//	If i < arr1.length
	//		arr1[i] = Duplicatearr[i]
	//	EndIf
	//	Else
	//		arr2[j++] = Duplicatearr[i]
	//	EndElse
	//EndFor
	//Stop
	
	//Time Complexity O(nlogn) + O(n) _ O(n)
	//space Complexity O(n)
	
	public static void mergeSortedArray(int arr1[], int arr2[]) {
		
		int Duplicatearr[] = new int[arr1.length + arr2.length];
		int temp = 0;
		
		for(int i = 0; i < Duplicatearr.length; i++) {
			if(i < arr1.length) {
				Duplicatearr[i] = arr1[i];
			}
			else {
				Duplicatearr[i] = arr2[temp++];
			}
		}
		Arrays.sort(Duplicatearr);
		temp = 0;
		
		for(int i = 0; i < Duplicatearr.length; i++) {
			if(i < arr1.length) {
				arr1[i] = Duplicatearr[i];
			}
			else {
				arr2[temp++] = Duplicatearr[i];
			}
		}
		printarr(arr1,arr2);
		
		
	}

//------------------------------------------------------------------------------
//method 2 using insertion sort technique
//------------------------------------------------------------------------------
	
	//step 1 compare the 1st element of arr1 and arr2
	//if the arr2 element is greater than arr1 leave as it is and move to next element of arr1
	//if the arr1 element is greater than arr2 then swap them 
	//and sort the arr2 so that it arr2 becomes sorted 
	//this algorithm works when both the arrays are sorted
	
	//Time Complexity O(n X m)
	//space Complexity O(1)
	
	public static void mergeSortedArray2(int arr1[], int arr2[]) {
		
		int p = 0;
		int q = 0;
		
		while (p < arr1.length) {
			
			if(arr1[p] < arr2[q]) {
				p++;
			}
			else if(arr1[p] > arr2[q]) {
				swap(arr1,arr2,p,q);
				Arrays.sort(arr2);
			}
		}
		
		printarr(arr1,arr2);
	}
	
//------------------------------------------------------------------------------------
//Method 3 Gap Algorithm 
//------------------------------------------------------------------------------------
	
	//method 3 gap algorithm
	//get the total length of both arrays and sum it up
	//Declare temp = 0;
	//step 1 divide the sum /= 2 
	//if sum != 0
	//	step1 compare arr1[temp] and arr2[sum]
	//	if(arr1[temp] < arr2[sum]) 
	//		Then temp++ , sum++
	//	End If
	//	Else IF(arr1[temp > arr2[sum]){
	//		Then swap arr1[temp],arr2[sum]
	//		temp++ , sum++
	//
	
	//Gap
	public static int nextGap(int gap) {
		if(gap <= 1) {
			return 0;
		}
		return (gap/2) + (gap%2);
	}
	
	public static void mergeSortedArray3(int arr1[], int arr2[]) {
		
		int n = arr1.length; 
		int m = arr2.length;
		int i,j,gap = m + n;
		
		for(gap = nextGap(gap) ; gap > 0; gap = nextGap(gap)) {
		
			//arr1
			for(i = 0; i+gap < n; i++) {
				if(arr1[i] > arr1[i+gap]) {
					int temp = arr1[i];
					arr1[i] = arr1[i+gap];
					arr1[i+gap] = temp;
				}
			}
			
			//sorting both arrays
			for(j = gap > n ? gap-n : 0; i < n && j < m; i++,j++) {
				if(arr1[i] > arr2[j]) {
					int temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = temp;
				}
			}
			
			if (j < m) {
				for( j = 0; j+gap < m; j++) {
					if(arr2[j] > arr2[j+1]) {
						int temp = arr2[j];
						arr2[j] = arr2[j+1];
						arr2[j+1] = temp;
					}
				}
			}
		}

		printarr(arr1,arr2);
		
	}
	
//---------------------------------------------------------------------
//swap
//----------------------------------------------------------------------
	public static void swap(int arr1[],int arr2[], int a, int b) {
		int temp = arr1[a];
		arr1[a] = arr2[b];
		arr2[b] = temp;
	}
	
//------------------------------------------------------------------------
//print
//------------------------------------------------------------------------
	public static void printarr(int arr1[], int arr2[]) {
		for(int i : arr1) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : arr2) {
			System.out.print(i+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr1[] = {3,27,38,43};
		int arr2[] = {9,10,82};
		
		mergeSortedArray3(arr1,arr2);
	}
}
