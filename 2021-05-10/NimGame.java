//https://leetcode.com/problems/nim-game/
package leetCode_Easy_118;

public class NimGame {

	//pseudoCode
	//Begin
	//Declare n
	//Output ("input n")
	//Input n
	//If(n%4==0)
	//	return false
	//EndIf
	//Else
	//	return true
	//End ELse
	//Stop
	
	//You can always win a Nim game if the number of stones nn in the pile is not divisible by 4.
	
	//1,2,3,5,6,7...true you will win
	//4,8,12... false 
//	Example 1:
//		Input: n = 4
//		Output: false
//		Explanation: These are the possible outcomes:
//		1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
//		2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
//		3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
//		In all outcomes, your friend wins.
	
//	Example 2:
//		Input: n = 1
//		Output: true
	
//	Example 3:
//		Input: n = 2
//		Output: true
	
	//NimGame
	public static boolean nimGame(int n) {
		if(n % 4 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		boolean result = nimGame(4);
		System.out.println(result);
	}
	
}

