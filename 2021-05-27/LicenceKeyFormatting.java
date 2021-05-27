package LeetCode118;

public class LicenceKeyFormatting {

public static String licenseKeyFormatting(String s, int k) {
        
		s.toUpperCase();
        StringBuilder result = new StringBuilder();
        int count = 0;
        
        for(int temp = s.length()-1; temp > 0; temp--){
        
            if(s.charAt(temp) != '-'){
                if(count < k){
                    result.append(s.charAt(temp));
                    count ++;
                }
                
                if(count == k ){
                    result.append('-');
                    count = 0;
                }
                
            }
            
        }
        if(result.length() > 0 && result.charAt(result.length()-1) == '-'){
        	result.setLength(result.length()-1);
        }
        return result.reverse().toString();
    }

	public static void main(String[] args) {
	
		String result = licenseKeyFormatting("---5F3Z-2E-9-W",4);
		
		System.out.println(result);
	}
}
