package SDE;

import java.util.Arrays;

public class Find_Missing_Repeating_num {

	//boolean method
	public static void findMisandRepeat(int arr[]) {
		
		boolean bool[] = new boolean[arr.length+1];
		Arrays.fill(bool, false);
		
		for(int i = 0; i < arr.length; i++) {
			if(bool[arr[i]] == true) {
				System.out.println("Repeating element "+arr[i]);
			}
			bool[arr[i]] = true;			
		}
		
		for(int i = 1; i <= arr.length; i++) {
			if(bool[i] == false) {
				System.out.println("Missing element "+i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,4};
		findMisandRepeat(arr);
	}
}

