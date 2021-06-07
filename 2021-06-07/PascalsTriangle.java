package Jp;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {

	public static List<List<Integer>> pascalsTriangle(int num){
		
		List<List<Integer>> list = new ArrayList();
		
		list.add(new ArrayList(1));
		
		for(int temp = 1; temp < num; temp++) {
			
			List<Integer> arr = new ArrayList();
			
			List<Integer> curr = list.get(temp-1);
			
			arr.add(1);
			for(int i = 1; i < temp; i++) {
				arr.add(curr.get(i-1) + curr.get(i));
			}
			arr.add(1);
			
			list.add(arr);
		}
		return list;
		
	}
	public static void main(String[] args) {
		int num = 6;
		
		List<List<Integer>> result = pascalsTriangle(num);
		
		System.out.println(result);
	}
}
