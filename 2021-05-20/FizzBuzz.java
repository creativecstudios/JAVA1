package LeetCode118;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
	     
        Integer temp = 1;
        List<String> list = new ArrayList<>();
        
        while(temp <= n){
            
            if(temp % 3 == 0 && temp % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(temp % 3 == 0){
                list.add("Fizz");
            }
            else if(temp % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(temp.toString());
            }
            temp++;
        }
        
        return list;
        
    }

	public static void main(String[] args) {
		
		List<String>  result = fizzBuzz(3);
		
		System.out.println(result);
	}
}
