//https://leetcode.com/problems/happy-number/

package leetCode_Easy_118;

import java.util.HashSet;
import java.util.Scanner;

public class HappyNumber {

//		Example 1:
//		Input: n = 19
//		Output: true
//		Explanation:
//		12 + 92 = 82
//		82 + 22 = 68
//		62 + 82 = 100
//		12 + 02 + 02 = 1
//		
//		Example 2:
//		Input: n = 2
//		Output: false

    public static  boolean isHappy(int n) {
        
        HashSet<Integer> map = new HashSet<>();
        
        while( n != 1){
            int result = 0;
            int current = n;
            int dummy = 0;
            while(current != 0){
                dummy = current % 10;
                result = result + (dummy*dummy);
                current /= 10;
            }
            
            if(map.contains(result)){
                return false;
            }
            else{
                map.add(result);
            }
            n = result;
        }
        return true;
    }
    public static void main(String[] args) {
		
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("\ninput the number to check happy or not");
    	int number = scanner.nextInt();
    	boolean result = isHappy(number);
    	System.out.println(result);
    	
	}
}
