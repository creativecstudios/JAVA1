//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package leetCode_Easy_118;

public class BestTimetoBuyandSellStock {

//	Example 1:
//		Input: prices = [7,1,5,3,6,4]
//		Output: 5
//		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//		Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
	
//	Example 2:
//		Input: prices = [7,6,4,3,1]
//		Output: 0
//		Explanation: In this case, no transactions are done and the max profit = 0.
	
	public static int maxProfit(int arr[]) {
		int max = 0;
		int min = Integer.MAX_VALUE;
		
		for(int tempIndex = 0; tempIndex < arr.length; tempIndex++) {
			if(arr[tempIndex] < min) {
				min = arr[tempIndex];
			}
			else {
				max = Math.max(max, arr[tempIndex]-min);
			}
		}
		return max;
	}
	
	//main function
	public static void main(String args[])
	{
		//7,6,4,3,1 no profit in this case;
		int arr[] = {7,1,2,5,3,7,5};

		int result = maxProfit(arr);

		System.out.println(result);
	}
}
