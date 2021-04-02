package Leetcode;
import java.util.Scanner;

class Reversenum {
    public static int reverse(int x) {
    
        int result = 0;
        int dummy = 0;
        while(x!=0){
            dummy = x%10;
            x /=10;
        if(result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && dummy >7)return 0;
        if(result < Integer.MIN_VALUE/10 || result == Integer.MIN_VALUE/10 && dummy <-8)return 0;
        result = (result*10) + dummy;  
        }
        return result;
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	System.out.println(reverse(input));
    }
}