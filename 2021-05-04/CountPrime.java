//https://leetcode.com/problems/count-primes/
package leetCode_Easy_118;

import java.util.Arrays;
import java.util.Scanner;

public class CountPrime {
	
//	Example 1:
//		Input: n = 10
//		Output: 4
//		Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//		
//	Example 2:
//		Input: n = 0
//		Output: 0

//	Example 3:
//		Input: n = 1
//		Output: 0
	
	//my logic
	    public static int countPrimes(int n) {
	        int j  = 0;
	        int prime = 0;
	        while(j<= n){
        	System.out.println("while "+j);
        		int count = 0;
	            for(int i= 1; i <= j; i++){
	            	System.out.println("for loop "+i);
	                if(j % i == 0){
	                    count++;
	                    System.out.println("count "+count);
	                }
             
	            }
	            
	            if(count == 2){
	                prime++;
	                System.out.println("prime"+prime);
	            }
	         
	            j++;
	        }
	        System.out.println(prime);
	        return prime;
	    }
	    //isPrime logic
	    public static int isPrime(int n) {
	    	int result = 0;
	    	//creating a boolean array of size n and assign all values as true 
	    	boolean arr[] = new boolean[n];
	    	Arrays.fill(arr, true);
	    	
	    	for(int tempIndex = 2; tempIndex < n; tempIndex++) {
	    		//if arr[i] == true then add the result;
	    		if(arr[tempIndex]) {
	    			result++;
	    		}
	    		//the inner for loop is for to false all the values of multiples of i cause the prime number is one  which divisible of 1 and itself. 
	    		for(int innertempIndex = tempIndex; innertempIndex < n; innertempIndex += tempIndex) {
	    			arr[innertempIndex] = false;
	    		}
	    		
	    	}
	    	return result;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	Scanner scanner = new Scanner(System.in);
	    	int num = scanner.nextInt();
	    	countPrimes(num);
	    	int result = isPrime(num);
	    	
	    	System.out.println(result);
	    	
		}
}
