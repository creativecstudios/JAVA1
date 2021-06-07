package Jp;

public class RemoveElement {

	public static int removeElement(int arr[],int target) {
		
		
//		int pos1 = 0;
//		int pos2 = 1;
//		
//		while(pos2 < arr.length) {
//			if(arr[pos1] == target) {
//				arr[pos1] = arr[pos2++];
//			}
//			else {
//				arr[++pos1] = arr[pos2];
//				pos2++;
//			}
//		}
//		return pos1;
		
		int temp = 0;
		for(int indx = 0; indx < arr.length; indx++) {
			if(arr[indx] != target) {
				arr[temp] = arr[indx];
				temp++;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int arr[] = {0,1,2,2,3,0,4,2};
		int target = 2;
		int indx = removeElement(arr,target);
		System.out.println(indx);
	}
}
