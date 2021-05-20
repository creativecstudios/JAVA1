package LeetCode118;

public class AddStrings {

	public static String addString(String num1,String num2) {
		
		
		int temp1 = num1.length()-1;
		int temp2 = num2.length()-1;
		int carry = 0;
		StringBuilder result = new StringBuilder();
		while(temp1 >= 0 || temp2 >= 0){
			
			int n1 = temp1 >=0 ? num1.charAt(temp1)-'0' : 0; 
			int n2 = temp2 >=0 ? num2.charAt(temp2)-'0' : 0;
			int sum = (n1 + n2 + carry)%10;
			
			carry = (n1 + n2 + carry)/10;
			
			result.append(sum);
			
			temp1--;
			temp2--;
		}
		return result.reverse().toString();
		
	}
	
	public static void main(String[] args) {
		
		String result = addString("121","11");
		System.out.println(result);
	}
}
