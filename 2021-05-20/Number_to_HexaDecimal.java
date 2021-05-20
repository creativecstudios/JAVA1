package LeetCode118;

public class Number_to_HexaDecimal {
	
	//Logic
	//to get remainder implement num & 15
	//to get quotient implement num >>> 4
	
	public static String num_to_Hexa(int num) {
		
		char hexaarr[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		StringBuffer result = new StringBuffer();
		
		while(num != 0) {
			
			result.append(hexaarr[num & 15]);
			
			num = num >>> 4;
		}
		
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		
		String result = num_to_Hexa(26);
		
		System.out.println(result);
	}
	
}
