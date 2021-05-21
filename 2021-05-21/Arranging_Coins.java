package LeetCode118;

public class Arranging_Coins {

	public static int Arranging_Coins(int n) {
		
		int start = 0;
		int end = n;
		
		int mid,curr;
		while(start <= end) {
			
			mid = start + (end - start)/2;
			
			curr = mid * (mid + 1)/2;
			
			if(curr == n) {
				return mid;
			}
			
			if(curr > n) {
				end = mid - 1;
			}
			else if(curr < n){
				start = mid + 1;
			}
		}
		return start-1;
	}
	
	public static void main(String[] args) {
		
		int result = Arranging_Coins(8);
		
		System.out.println(result);
	}
}
