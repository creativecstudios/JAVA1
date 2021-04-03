//https://leetcode.com/problems/add-two-numbers/
package Leetcode;
import java.util.Scanner;

class LongestSubstring {
        public static int lengthOfLongestSubstring(String s) {
        int indx1 = 0;
        int indx2 = 0;
        int max = 0;
        HashSet<Character> hashset = new HashSet();
        while(indx2 < s.length()){
            if(! hashset.contains(s.charAt(indx2))){
                hashset.add(s.charAt(indx2));
                indx2++;
                max = Math.max(hashset.size(),max);
            }
            else{
                hashset.remove(s.charAt(indx1));
                indx1++;
            }
        }
        return max;
    }

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(lengthofLongestSubstring(input));
	}
    
}