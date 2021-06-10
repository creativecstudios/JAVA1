package Jp;

public class DivideTwoInteger {
	
	//10 / 3 = 3
	// condition : not use (/ % *) operators
	
	// 10 - 3 = 6
	// 10 - 6 = 4
	// 10 - 12 = -2 then stop
	
	// 4 - 3 = 1
	// 4 - 6 = -2 Then stop
	
	//each time double the divisor by using left shift operator
	//subtract the dividend from divisor until it goes to negative value
	
	public static int divideTwoInteger(int dividend, int divisor) {
		
		if(dividend == 1 << 31 && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		
		boolean sign = (dividend >= 0) == (divisor >= 0) ? true : false;
		
		Math.abs(dividend);
		Math.abs(divisor);
		int result = 0;
		while(dividend - divisor >= 0) {
			
			int count = 0;
			while(dividend - (divisor << 1 << count) >= 0) {
				count++;
			}
			result += 1 << count;
			
			dividend -= divisor << count;
		}
		return result;
	}
	public static void main(String[] args) {
		int result = divideTwoInteger(10,3);
		System.out.println(result);
	}
	

}
