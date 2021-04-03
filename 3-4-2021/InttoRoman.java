package Leetcode;
import java.util.Scanner;

class IntToRoman {
    public String intToRoman(int num) {
        
        int numcode[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String numerals[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder result = new StringBuilder();
        for(int tempIndex = 0; tempIndex < numcode.length; tempIndex++){
            while(num >= numcode[tempIndex]){
                result.append(numerals[tempIndex]);
                num = num-numcode[tempIndex];
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	System.out.println(intToRoman(input));
    }
}