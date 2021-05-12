//https://leetcode.com/problems/guess-number-higher-or-lower/
package leetCode_Easy_118;

public class GuessNumber {
	
private static int num = 6;
//guess funcion
	public static int guess(int pick) {
		
		if(pick == num ) {
			return 0;
		}
		else if(num > pick) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	//Pseudo Code
	//Begin
	//Input number
	//Declare start = 1; end = number
	//While start <= end
	//	mid = start + (end - start)/2
	//	result = guess(mid)
	//	If result equals 0
	//		Then return mid
	//	EndIf
	//	Else if result less than 0
	//		Then end = mid -1
	//	End Else if
	//	Else
	//		start = mid + 1
	//	End else
	//End while
	//Stop
	
	//guessNumber
	public static int guessNumber(int n) {
		
		int start = 1;
		int end = n;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			int result = guess(mid);
			if(result == 0) {
				return mid;
			}
			else if(result < 0) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int result = guessNumber(10);
		
		System.out.println(result);
	}
}
