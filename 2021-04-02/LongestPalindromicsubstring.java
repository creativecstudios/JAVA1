//https://leetcode.com/problems/longest-palindromic-substring/
pacakge Leetcode;

import java.util.Scanner;
class LongestPalindrome {
    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        
        int start = 0; 
        int end = 0;
        
        for(int tempIndex=0; tempIndex < s.length(); tempIndex++){
            int length1 = expandfromMiddle(s, tempIndex, tempIndex);
            int length2 = expandfromMiddle(s,tempIndex,tempIndex+1);
            int result = Math.max(length1,length2);
            if(result > end - start){
                start = tempIndex-((result-1)/2);
                end = tempIndex+(result/2);
            }
        }
        return s.substring(start,end+1);
        
        
    }
    public int expandfromMiddle(String s, int left, int right){
        
        if(s == null || left>right) return 0;
        
        while(left >=0 &&  right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        return right-left-1;
    }

    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Input the String");
	String inputstring = scanner.nextLine();
	System.out.println(longestPalindrome(input));
    }	
}