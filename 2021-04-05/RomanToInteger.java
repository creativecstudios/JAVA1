//https://leetcode.com/problems/roman-to-integer/submissions/
package Leetcode;
import java.util.Scanner;

class RomanToInteger {
	public static int romanToInt(String inputString) {
		inputString = inputString.replaceAll("IV","IIII")
					 .replaceAll("IX","VIIII")
					 .replaceAll("XL","XXXX")
					 .replaceAll("XC","LXXXX")
					 .replaceAll("CD","CCCC")
					 .replaceAll("CM","DCCCC");
		int result = 0;
		for(char char : inputString.CharArray()) {
			switch(char) {
				case 'I' :
					result +=1;
					break;
				case 'V' :
					result +=5;
					break;
				case 'x' :
					result +=10;
					break;
				case 'L' :
					result +=50;
					break;
				case 'C' :
					result +=100;
					break;
				case 'D' :
					result +=500;
					break;
				case 'M' :
					result +=1000;
					break;
			}
		}
		return result;
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine;
		inputString.toUpperCase();
		System.out.println(romanToInt(inputString));
	}
}