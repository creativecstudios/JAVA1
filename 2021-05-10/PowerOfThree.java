//https://leetcode.com/problems/power-of-three/

package leetCode_Easy_118;

public class PowerOfThree {

	//pseudo code
	
	//Begin
	//Declare mul = 1
	//Output("input n")
	//Input n
	//While mul < n
	//	mul = mul * 3
	//End While
	//If mul == n
	//	retur true
	//End If
	//Else
	//	return false
	//End Else
	//Stop
	
	
	//method 
	public static boolean powerofThree(int n) {
		long mul = 1;
		while(mul < n) {
			mul *= 3;
		}
		if(mul == n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		
		boolean result = powerofThree(45);
		System.out.println(result);
	}
}
