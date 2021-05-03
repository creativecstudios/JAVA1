//https://leetcode.com/problems/excel-sheet-column-title/
package leetCode_Easy_118;

import java.util.Scanner;
public class ExcelSheetColumnTitle {

//	A -> 1
//	B -> 2
//	C -> 3
//	...
//	Z -> 26
//	AA -> 27
//	AB -> 28 
//	...
	
	
	//ExcelSheetcolumnTitile
	public static String columntitle(int num) {
		StringBuilder result = new StringBuilder();
		while(num != 0) {
			num--;
			char output = (char)((num%26)+65);
			result.insert(0, output);
			num /= 26;
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		String result = columntitle(num);
		System.out.println(result);
	}
}
