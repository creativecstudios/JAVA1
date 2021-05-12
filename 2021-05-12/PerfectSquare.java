//https://leetcode.com/problems/valid-perfect-square/

package leetCode_Easy_118;

public class PerfectSqrt {

//Pseudo Code
	//Begin
	//To find the given num is perfect Square or not ?
	// Declare variable ans of double datatype
	//Store Math.sqrt(num) into ans
	//If ans divides by 1 == 0.0 Then return true End IF
	//Else return false End Else
	//Stop
	
	//method perfectSquare
	public static boolean perfectSquare(int num) {
		double ans = Math.sqrt(num);
		if(ans % 1 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
//Pseudo Code
	//Begin
	//To find the given num is perfect square or not ?
	//Input num
	//Declare start = 0 & end = num
	//While start <= end
	//		Declared variable mid
	//		mid = start + (end - start)/2
	//		Declare variable temp
	//		Where temp will store mid * mid
	//		If temp > num Then assign end = mid -1 End If
	//		Else If temp < num Then assign start = mid + 1 	End Else If
	//		Else If temp == num 	return True
	//End While
	//If all the above cases fails return false
	//Stop
	
	//method2
	public static boolean perfectSquare2(int num) {
		long start = 0;
		long end = num;
		while(start <= end) {
			
			long mid = start + (end-start)/2;
			
			long temp = mid * mid;
			
			if(temp > num) {
				end = mid - 1;
			}
			else if(temp < num) {
				start = mid + 1;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	//recursive method
	public static boolean perfectSquare3(int num) {
		return search(0,num,num);
	}
//	Divide And Conquer 
//	This technique can be divided into the following three parts:
//
//	Divide: This involves dividing the problem into some sub problem.
//	Conquer: Sub problem by calling recursively until sub problem solved.
//	Combine: The Sub problem Solved so that we will get find problem solution. 
	
	public static boolean search(long start, long end, int num) {
		if(start > end) {
			return false;
		}
		
		long mid = start + (end - start)/2;
		
		long temp = mid * mid;
		
		if(temp > num) {
			return search(start, mid-1, num);
		}
		else if(temp < num) {
			return search(mid+1, end, num);
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		
		boolean result = perfectSquare3(16);
		
		System.out.println(result);
	}
}
