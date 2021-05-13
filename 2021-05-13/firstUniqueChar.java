//https://leetcode.com/problems/first-unique-character-in-a-string/
package LeetCode383;

// Example 1:

// Input: s = "leetcode"
// Output: 0
// Example 2:

// Input: s = "loveleetcode"
// Output: 2
// Example 3:

// Input: s = "aabb"
// Output: -1
	
public class firstUniqueChar {

	//pseudoCode
	//Begin
	//Int canConstruct(s)
	//For i from 0 to s.length
	//	If s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))
	//		Then return i
	//End For
	//Return -1
	//Stop
	//method
	
	public static int canConstruct(String s) {
  
		for(int i=0; i<s.length(); i++){
			
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                return i;
        }
        return -1;
    }
	
	public static void main(String[] args) {
		
		int result = canConstruct("aabbc");
		System.out.println(result);
		
	}
}
