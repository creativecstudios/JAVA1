//https://leetcode.com/problems/pascals-triangle/

package leetCode_Easy_118;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {

	//pascals triangle
	//      1
	//     1 1
	//    1 2 1
	//   1 3 3 1
	//  1 4 6 4 1
	
	//adding 1 to each row in the first index
	
	//don't disturb first and last elements for that the inner loop temp starts with 1st index and not from 0th index.
	
	// form 3rd row line 9 : now it becomes 1,1,1 by line 32 it becomes 1,1+1,1 = > 1,2,1
	
	//line 10 : now it becomes 1,1,2,1 by line 32 1,1+2,2+1,1 = > 1,3,3,1
	
	//line 11 : 1,1,3,3,1 by line 32 => 1,1+3,3+3,3+1,1 => 1,4,6,4,1 and so on....
	
	public static List<List<Integer>> pascalsTriangle(int rows){
		
		List<List<Integer>> result = new ArrayList<>();
		
		if(rows == 0) {
			return result;
		}
		
		List<Integer> row = new ArrayList<>();
		for(int tempIndex = 0; tempIndex < rows; tempIndex++) {
			row.add(0,1);
			//eliminating first and last elements
			//start adding from 1st index to so on
			for(int temp = 1; temp < tempIndex; temp++) {
				
				row.set(temp, row.get(temp)+row.get(temp+1));
				
			}
			result.add(new ArrayList<Integer>(row));
		}
		return result;
	}
	
	//main function
	
	public static void main(String args[]) {
		
		List<List<Integer>> result = pascalsTriangle(5);
		
		System.out.println(result);
	}
}
