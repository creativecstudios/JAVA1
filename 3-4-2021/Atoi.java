package Leetcode;
import java.util.Scanner;
class AtoI {
    public int myAtoi(String s) {
        
        if(s == null || s.isEmpty()){
            return 0;
        }
        int length = s.length();
        int i=0;
        int sign = 1;
        long result = 0;
        
        while(i < length &&s.charAt(i) == ' '){
            ++i;
        }
        
        if(i>=length){
            return 0;
        }
        
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            sign = s.charAt(i++) == '+' ? 1 : -1;
        }
        
        while(i<length && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i++) - '0');
            
            if(result*sign > Integer.MAX_VALUE || result*sign < Integer.MIN_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        
        return (int)(sign*result);
    }
    public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the input string");
	String input = scanner.nextLine();
	System.out.println(myAtoi(input));
    }
}