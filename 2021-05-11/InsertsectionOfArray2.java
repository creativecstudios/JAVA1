//https://leetcode.com/problems/intersection-of-two-arrays-ii/
package leetCode_Easy_118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//PseudoCode
//Begin
//Input arr1[] and arr2[]
//Declare List<Integer> list
//Initialize i = 0, j= 0
//Sort arr1 and arr2
//While i < arr1.length && j < arr2.length
//	If arr1[i] less than arr2[j] Then Increment i End If
//	ElseIf arr1[i] greater than arr2[j] Then Increment j End ElseIF
//	Else 
//		list.add(arr1[i]) 
//		Increment i 
//		Increment j
//	End Else
//End While
//Declare result[] of size list
//Add list elements into result[]
//return result
//Stop

public class InsertsectionOfArray2 {

	public static int[] intersectionOfArray(int nums1[], int nums2[]) {
	
		List<Integer> list = new ArrayList<>();
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0;
		int j = 0;
		
		while(i < nums1.length && j < nums2.length) {
			
			if(nums1[i] <  nums2[j]) {
				i++;
			}
			else if(nums1[i] > nums2[j]) {
				j++;
			}
			else {
				
					list.add(nums1[i]);
					i++;
					j++;
				
			}
		}
		int result[] = new int[list.size()];
		int count= 0;
		for(int temp : list) {
			result[count++] = temp;
		}
		return result;
		
	}
	public static void main(String[] args) {
		int arr1[] = {1,2,2,2};
		int arr2[] = {2,2,1};
		
		int result[] = intersectionOfArray(arr1,arr2);
		
		for(int temp : result) {
			System.out.print(temp+" ");
		}

	}
}