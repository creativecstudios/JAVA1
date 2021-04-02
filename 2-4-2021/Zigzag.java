package Leetcode;
import java.util.Scanner;

class ZigZag {
    public static String convert(String s, int numRows) {
        int length = s.length();
        if(numRows > length || numRows <=1){
            return s;
        }
    
        int interval = 2*numRows-2;
    
        char[]  result = new char[length];
        int count = 0;
        
        for(int i=0; i<numRows; i++){
            int step = interval - 2*i;
            for(int j=i; j<length; j+=interval){
                result[count] = s.charAt(j);
                count++;
                if(step<interval && step > 0 && j+step <length){
                    result[count] = s.charAt(j+step);
                    count++;
                }
            }
        }
        return new String(result);
    }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	String inputstr = scanner.nextLine();
	int numRows = scanner.nextInt();
	System.out.println(convert(inputstr,numRows));
    }
}