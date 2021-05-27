//https://leetcode.com/problems/island-perimeter/
package LeetCode118;

public class IslandPerimeter {

	public static int perimeter(int arr[][]) {
		
		int sum = 0;
		
		for(int temp = 0; temp < arr.length; temp++) {
			for(int temp1 = 0; temp1 < arr[0].length; temp1++) {
				
				if(arr[temp][temp1] == 1) {
					sum += 4;
					
					if(temp > 0 && arr[temp-1][temp1] == 1) {
						sum -= 2;
					}
					if(temp1 > 0 && arr[temp][temp1-1] == 1) {
						sum -= 2;
					}
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[][] ={{0,0,1,0},{1,1,0,0},{0,1,0,0},{0,1,1,0}};
		
		int result = perimeter(arr);
		System.out.println(result);
		
	}
}
