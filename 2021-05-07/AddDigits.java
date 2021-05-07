//https://leetcode.com/problems/add-digits/
package leetCode_Easy_118;

public class AddDigits {

	public static int addDigits(int num) {
	  
        while(num > 9){
            int temp  = num;
            int sum = 0;
            while(temp != 0){
                int dummy = temp % 10;
                sum = sum + dummy;
                temp /= 10;
            }
            num = sum;
        }
        return num;
    }
	
	public static void main(String[] args) {
		
		int result = addDigits(32);
		System.out.println(result);
	}
}
