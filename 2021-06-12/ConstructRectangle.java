package Jp;

import java.util.Arrays;

public class ConstructRectangle {

//	The area of the rectangular web page you designed must equal to the given target area.
//	The width W should not be larger than the length L, which means L >= W.
//	The difference between length L and width W should be as small as possible.
	
	public static int[] constructRectangle(int area) {
		
		if(area == 0) {
			return new int[] {0,0};
		}
		if(area == 1) {
			return new int[] {1,1};
		}
		int sqrt = (int)Math.sqrt(area);
		int result[] = new int[2];
		int temp = 1;
		int diff = Integer.MAX_VALUE;
		while(temp <= area) {
			if(area % temp == 0) {
				if(Math.abs(temp - area/temp) < diff) {
					diff = Math.abs(temp - area/temp);
					if(temp > area/temp) {
						result[0] = temp;
						result[1] = area/temp;
					}else {
						result[0] = area/temp;
						result[1] = temp;
					}
					
						
				}
			}
			temp++;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int result[] = constructRectangle(4);
		System.out.println(Arrays.toString(result));
	}
}
