//https://leetcode.com/problems/pascals-triangle-ii/

package leetCode_Easy_118;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangleII {

	//pascalsTriangleII
	
	public static List<Integer> pascalsTriangleII(int rows){
		
		List<Integer> result = new ArrayList<>();
		
		for(int i = 0; i <= rows; i++) {
			result.add(0,1);
			for(int j = 1; j < i; j++) {
				result.set(j, result.get(j)+result.get(j+1));
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		List<Integer> result = new ArrayList<>();
		
		result = pascalsTriangleII(4);
		
		System.out.println(result);
		
	}
}
