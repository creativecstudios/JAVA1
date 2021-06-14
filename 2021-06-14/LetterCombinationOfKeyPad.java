//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

package Jp;
import java.util.List;
import java.util.ArrayList;

public class LetterCombinationOfKeyPad {

	static List<String> result = null;
	static String arr[] = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public static List<String> letterCombination(String num){
		result = new ArrayList<>();
		if(num.length() == 0) {
			return result;
		}
		combination(0,num,new StringBuilder());
		return result;
	}
	
	public static void combination(int curr,String num,StringBuilder temp) {
		if(curr == num.length()) {
			result.add(temp.toString());
			return;
		}
		
		char ch = num.charAt(curr);
		
		String str = arr[ch-'0'];
		
		for(char indx : str.toCharArray()) {
			temp.append(indx);
			combination(curr+1,num,temp);
			temp.deleteCharAt(temp.length()-1);
		}
	}
	
	public static void main(String[] args) {
		List<String> result = letterCombination("23");
		System.out.println(result);
	}
}
