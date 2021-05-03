//https://leetcode.com/problems/excel-sheet-column-number/
package leetCode_Easy_118;

public class ExcelSheetColumnNumber {

	//excelsheeetcolumnNumber
	public static int columnNumber(String str) {
		
		int result = 0;
		int factor = 1;
		for(int tempIndex = str.length()-1; tempIndex >=0; tempIndex--) {
			
			result += factor *(str.charAt(tempIndex)-'A'+1);
			factor *= 26;
		}
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(columnNumber("AB"));
	}
}
