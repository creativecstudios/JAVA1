//https://leetcode.com/problems/assign-cookies/
package LeetCode118;

import java.util.Arrays;

public class AssignCookies {
	
	//Logic 
	//	Use Two pointer Technique

	//pseudo code
	//Begin
	//assigncookies(int greedfactor[],int sizeofcookie[])
	//Sort both arrays
	//Initialize two pointers for traversing both the arrays gptr, sptr
	//Initialize count to count 
	//While(gptr < greedfactor && sptr < sizeofcookie && count < greedfactor)
	//	If(sizeofcookie[sptr] <= greedfactor[gptr])
	//		Then increment gptr,sptr,count
	//	End If
	//	Else
	//		Increment gptr
	//	End else
	//ENd while
	//return count
	//Stop
	
	public static int assignCookies(int greedfactor[], int sizeofcookie[]) {
		
		Arrays.sort(greedfactor);
		Arrays.sort(sizeofcookie);
		
		int gptr = 0, sptr = 0, count = 0;
		
		while(gptr < greedfactor.length && sptr < sizeofcookie.length && count < greedfactor.length) {
			
			if(sizeofcookie[sptr] <= greedfactor[gptr]) {
				gptr++;
				sptr++;
				count++;
			}
			else {
				gptr++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int[] greedfactor = {1,2,3};
		int[] sizeofcookie = {1,2};
		
		int result = assignCookies(greedfactor,sizeofcookie);
		
		System.out.println(result);
	}
}
