//https://leetcode.com/problems/power-of-four/
package leetCode_Easy_118;

public class PowerofFour {

	//pseudo code
	
		//Begin
		//Declare mul = 1
		//Output("input n")
		//Input n
		//While mul < n
		//	mul = mul * 4
		//End While
		//If mul == n
		//	retur true
		//End If
		//Else
		//	return false
		//End Else
		//Stop
		

	  public static boolean isPowerOfFour(int n) {
		     
	        long mul = 1;
	        while(mul < n){
	            mul *= 4;
	        }
	        if(mul == n){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	  
	  public static void main(String[] args) {
		
		  boolean result = isPowerOfFour(4);
		
		  System.out.println(result);
	}
}
