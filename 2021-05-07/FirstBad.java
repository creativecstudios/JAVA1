//https://leetcode.com/problems/first-bad-version/
package leetCode_Easy_118;

public class FirstBad {

	public static boolean isBadVersion(int num) {
		return true;
	}
    public static int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int mid = 0;
        int result = n;
        while(start <= end){
             mid = start + (end-start)/2;
             
             if(isBadVersion(mid)){
            	 
                result = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            } 
        }
        return result;
    }
    
    public static void main(String[] args) {
	
    	int result = firstBadVersion(7);
    	
    	isBadVersion(4);
    	
    	System.out.println(result);
  
	}
}
