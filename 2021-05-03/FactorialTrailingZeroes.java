//https://leetcode.com/problems/factorial-trailing-zeroes/
package leetCode_Easy_118;

public class FactorialTrailingZeroes {

	public static int trailingZeros(int n) {
//        if(n==0){
//            return 0;
//        }
//        int fact = 1;
//        for(int i = 1; i<=n; i++){
//            fact = fact* i;
//        }
//        System.out.println(fact);
//        int count = 0;
//        if(fact % 10 == 0){
//            while(fact != 0){
//            
//                if(fact % 10 == 0){
//                    count++;
//                }
//                fact = fact/10;
//            }
//            return count;
//        }
//        else{
//            return 0;
//        }
//    }
		
		int count = 0;
		while(n > 0) {
			n /= 5;
			count += n;
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println(trailingZeros(10));
	}
}
