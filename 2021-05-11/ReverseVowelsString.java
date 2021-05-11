//https://leetcode.com/problems/reverse-vowels-of-a-string/
package leetCode_Easy_118;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsString {
//pseudo code
	//ReverseVowels()
	//Begin
	//Output("Input string s")
	//Input s
	//Delare char[] arr
	// arr[] = s.toCharArray()
	//Declare start = 0, end = s.length -1
	//While start < end
	//	If vowel(arr[start]) && vowel(arr[end])
	//		swap(arr,start,end)
	//		Increment start
	//		Decrement End
	//	End If
	//	If(!vowel(arr[start))
	//		Increment Start
	//	End If
	//	If(!vowel(arr[end]))
	//		Decrement end
	//	End If
	//End while
	//return String(arr)
	//Stop
	
	//IsVowel(char ch)
	//Begin
	//return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' 
	//Stop

	//Swap(char arr[],start,end)
	//Begin
	//Declare char temp
	//temp = arr[start]
	//arr[start] = arr[end]
	//arr[end] = temp
	//End
	
//method 1
    public static String reverseVowels1(String s) {
        int start = 0;
        int end = s.length()-1;
        char arr[] = s.toCharArray();
       
        while(start < end){
        	
        	if(isvowel(arr[start]) && isvowel(arr[end])) {
        		swap(arr,start,end);
        		start++;
        		end--;	
        	}
        	
        	if(!isvowel(arr[start])) {
        		start++;
        	}
        	if(!isvowel(arr[end])) {
        		end--;
        	}
        }
        
        s = String.valueOf(arr);
        return s;
    }
    
    public static void swap(char arr[], int start, int end) {
    	char temp;
    	temp = arr[start];
    	arr[start] = arr[end];
    	arr[end] = temp;
    }
    
    public static boolean isvowel(char c) {
    	return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ;
    }
    
 //method 2 using HashSet
    
    public static String reverseVowels2(String s) {
    	int start = 0;
    	int end = s.length()-1;
    	char arr[] = s.toCharArray();
    	char temp;
    	Set<Character> set = new HashSet<>();
    	set.add('a');
    	set.add('A');
    	set.add('e');
    	set.add('E');
    	set.add('i');
    	set.add('I');
    	set.add('o');
    	set.add('O');
    	set.add('u');
    	set.add('U');
    	
    	while(start < end) {
    		
    		while(start < end && !set.contains(arr[start])) {
    			start++;
    		}
    		while(start < end && !set.contains(arr[end])) {
    			end--;
    		}
    		temp = arr[start];
    		arr[start++] = arr[end];
    		arr[end--] = temp;
    		
    	}
    	return new String(arr);
    }
    
    public static void main(String[] args) {
		String revrse = reverseVowels2("hello");
		System.out.println(revrse);
	}
}

