//https://leetcode.com/problems/word-pattern/

package leetCode_Easy_118;

import java.util.HashMap;

public class WordPattern {
Pseudo Code
Begin
String pattern,s
Output("input pattern")
Input pattern
Output("input s")
Input s
String[] str = s.split(" ")
HashMap<Character,String> map = new HashMap();
If (str.length != pattern.length)
	return false
Declare i = 0
For i 0 to pattern.length
	Declare String curr
	curr = map.get(pattern.charAt(i))
	If(curr != null)
		If(!curr.equals(str[i]))
			return false;
		End If
	End If
	Else If(!map.containsValue(str[i]))
		map.add(pattern.charAt(i),str[i])
	End Else If
	Else
		return false
	End Else
End For
Return True
Stop
	//wordPattern
	public static boolean wordPattern(String pattern,String s) {
		 String str[] = s.split(" ");
	        
	        HashMap<Character,String> map = new HashMap();
	        
	        if(str.length != pattern.length()){
	            return false;
	        }
	        
	        for(int i = 0; i < pattern.length(); i++){
	                String curr = map.get(pattern.charAt(i));
	            
	                if(curr != null){
	                    if(!curr.equals(str[i])){
	                        return false;
	                    }
	                }
	                else if(!map.containsValue(str[i])){
	                    map.put(pattern.charAt(i),str[i]);
	                }
	                else{
	                    return false;
	                }
	        }
	        return true;
	}

	public static void main(String[] args) {
		boolean result = wordPattern("abab","dog cat dog cat");
		System.out.println(result);
	}
}
