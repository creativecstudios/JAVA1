//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
package leetCode_Easy_118;

public class BestTimetoBuyandSellStockII {

//		Example 1:
//
//		Input: prices = [7,1,5,3,6,4]
//		Output: 7
//		Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//		Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
//		Example 2:
//
//		Input: prices = [1,2,3,4,5]
//		Output: 4
//		Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//		Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
//		Example 3:
//
//		Input: prices = [7,6,4,3,1]
//		Output: 0
//		Explanation: In this case, no transaction is done, i.e., max profit = 0.
	
	public static int maxProfit(int[] prices) {
		
		int profit = 0;
		
		for(int temp = 0; temp < prices.length-1; temp++) {
			if(prices[temp+1] > prices [temp]) {
				profit += prices[temp+1]-prices[temp];
			}
		}
		return profit;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,1,3,2,7,2};
		int result = maxProfit(arr);
		System.out.println(result);
	}
}
