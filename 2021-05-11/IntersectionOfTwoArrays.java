//https://leetcode.com/problems/intersection-of-two-arrays/
package leetCode_Easy_118;

import java.util.HashSet;

import java.util.ArrayList;


//pseudoCode
//Begin
//Output("Input arr1")
//Input arr1[]
//Output("Input arr2")
//Input arr2[]
//Declare HashSet set1, set2
//ForEach n to arr1
//	set1.add(n)
//EndForEach
//ForEach n to arr2
//	set2.add(n)
//EndForEach
//set1.retainAll(set2)
//Declare result[] with set1.size()
//Initialize count = 0
//ForEach temp to set1
//	result[count++] = temp
//End ForEach
//return result
//Stop

public class IntersectionOfTwoArrays {

	public static int[] intersectionOfArrays(int arr1[], int arr2[]) {
		
//		ArrayList<Integer> set1 = new ArrayList<Integer>();
//		ArrayList<Integer> set2 = new ArrayList<Integer>();
		//while performing the retainAll() method using arrayList for se1.retainAll(set2)
		//it will retain all the elements form set2
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();

		//whereas performing the retainAll() method using HashSet for set1.retainAll(set2) 
		//it will remove the duplicates and retailAll the elements form set2
		for(int n1 : arr1) {
			set1.add(n1);
		}
		
		for(int n2 : arr2) {
			set2.add(n2);
		}
		
		set1.retainAll(set2);
		
		int result[] = new int[set1.size()];
		int count = 0;
		for(int temp : set1) {
			result[count++] = temp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1,2,2,2};
		int arr2[] = {2,2,1};
		
		int result[] = intersectionOfArrays(arr1,arr2);
		
		for(int temp : result) {
			System.out.print(temp+" ");
		}
	}
}
