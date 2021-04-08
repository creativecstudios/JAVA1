//https://leetcode.com/problems/length-of-last-word/

package Leetcode;
import java.util.Scanner;

class LengthOfLastWord{
	public static int lengthOfLastWord(String inputstr){
		
		int count = 0;
		boolean space = true;

		for(int tempIndex = inputstr.length()-1; tempIndex >=0; tempIndex--){
			if(inputstr.charAt(tempIndex) != ' ' ){
				count +=1;
				space = false;
			}
			else{
				if(!space){	
					break;
				}
			}	
		}
		return count;	
	}
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String");
		String inputstr = scanner.nextLine();
		System.out.println(lengthOfLastWord(inputstr));
	}
}