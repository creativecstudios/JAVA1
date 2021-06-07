package Jp;

public class LengthOfLastWord {

//	Input: s = "Hello World"
//	Output: 5
	
	public static int lengthoflastword(String str) {
		
		int count = 0;
		for(int temp = str.length()-1; temp >=0; temp--) {
			if(str.charAt(temp)!= ' ') {
				count++;
			}
			if(str.charAt(temp) == ' ') {
				break;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String str = " ";
		
		int result = lengthoflastword(str);
		
		System.out.println(result);
	}
}
