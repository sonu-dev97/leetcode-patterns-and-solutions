package leetcode_121;

public class BestTimeToBuySellStock {
    public static int maximumProfit(int[] prices) {
        int buyAtMinimum = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int currentPrice : prices) {
            if (currentPrice < buyAtMinimum) {
                buyAtMinimum = currentPrice;
            } else {
                int currentProfit = currentPrice - buyAtMinimum;
                maxProfit = Math.max(maxProfit, currentProfit);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; // 7,6,4,3,1 
        System.out.println("maximum profit: "+ maximumProfit(prices));
    }
}

//Example 1:
//Input : [7,1,5,3,6,4]
//Output: 5
// Note : that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

//Example 2:
//Input: 7,6,4,3,1
//Output: 0
