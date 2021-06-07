package Jp;

public class AddBinary {
	//inp1 = 11
	//inp2 = 1
	//output = 100
	
	public static String addBinary(String inp1, String inp2) {
		
		int len1 = inp1.length()-1,len2 = inp2.length()-1;
		int sum = 0,carry = 0;
		StringBuilder result = new StringBuilder();
		
		while(len1 >= 0 || len2 >= 0) {
			sum = carry;
			
			if(len1 >= 0) {
				sum += inp1.charAt(len1--)-'0';
			}
			
			if(len1 >= 0) {
				sum += inp2.charAt(len2--)-'0';
			}
			
			result.insert(0,sum % 2);
			carry = sum / 2;
		}
		if(carry > 0) {
			result.insert(0,1);
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		
		String inp1 = "11";
		String inp2 = "1";
		
		String result = addBinary(inp1,inp2);
		
		System.out.println(result);
	}
}
//loop1 
//	sum = 0
//	sum = 0 + 1 + 1 = 2
//	result = 0
//	carry = 1

//loop2
//	sum = 1
//	sum = 1 + 1 + 0
//	result = 