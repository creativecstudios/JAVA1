https://leetcode.com/problems/longest-common-prefix/
package Leetcode;
import java.util.Scanner;

class LongestPrefix {
    static Scanner sccaner1 = new Scaner(System.in);

    public static String longestCommonPrefix(String[] strs) {
     
        if(strs == null || strs.length == 0)
            return "";
        
        
        for(int strlen = 0; strlen<strs[0].length(); ++strlen){
            for(int strarr = 1; strarr < strs.length; ++strarr){
                if(strlen >= strs[strarr].length() || strs[strarr].charAt(strlen) != strs[0].charAt(strlen))
                
                    return strs[strarr].substring(0,strlen);
                
            }
        }
        return strs[0];
    }

//input function
    public static void inputArray(String arr[],int size) {
	String arr1[] = new String[size];
	System.out.println("Give the input elements for array");
	for(int inputIndex = 0; inputIndex<arr1.length; inputIndex++) {
		arr[inputIndex] = scanner1.nextLine();
	}
		
    }
    public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of array")
	int size = scanner.nextInt();
	String arr[] = new arr[size];

	inputArray(String arr[],int size);
	System.out.println(longestCommonPrefix(arr));
    }
}