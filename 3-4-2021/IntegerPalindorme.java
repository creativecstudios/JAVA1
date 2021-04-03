package Leetcode;
import java.util.Scanner;
class Integerpalindrome {
    public boolean isPalindrome(int x) {
     
        if(x==0){
            return true;
        }
        
        if(x < 0 || x % 10 == 0){
            return false;
        }
        
        int result = 0;
        
        while(x > result){
           int dummy = x%10;
            x /=10;
            result = (result *10) + dummy;
        }
        
        if(x == result || x == result/10){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	System.out.println(isPalindrome(input));
    }

}