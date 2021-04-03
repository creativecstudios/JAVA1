//https://leetcode.com/problems/container-with-most-water/
package Leetcode;
import java.util.Scanner;

class ContainerWithwater {
    public int maxArea(int[] height) {
        int length = height.length-1;
        int i = 0;
        int max = 0;
        while(i < length){
            int area = (length-i)*Math.min(height[i],height[length]);
            if(max < area){
                max = area;
            }
            if(height[i]< height[length]){
                i++;
            }
            else{
                length--;
            }
        }
        return max;
        }
    public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Size of array");
	int size = scanner.nextInt();
        int arr[] = new int(size);
	Merge_Sorted_Array ref = new Merge_Sorted_Array();
	ref.inputArray(arr,size);
	System.out.println(maxArea(arr));
    }  
}