//https://leetcode.com/problems/move-zeroes/

package leetCode_Easy_118;

public class Movezeros {

	public static void main(String[] args) {
		int arr[] = {1,0,3};
		
		int start = 0;
		int end = arr.length;
		
		while(start < end) {
			
			if(arr[start] == 0) {
				for(int i = start; i < end-1; i++ ) {
					
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
						
				}
				arr[end-1] = 0;
				end--;
			}
			else {
				start++;
			}
		}
		for(int j : arr) {
			System.out.print(j+" ");
		}
	}
	
	
}
