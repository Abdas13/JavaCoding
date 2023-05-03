package leetCode.arrays;

public class BestPriceForProfit {
    public static void main(String[] args) {
        // prices in the days of week = [7,1,5,3,6,4]
        //output=5      (profit=max(price[right]-price[left]))

        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        if(prices.length==1) return 0;

        int left=0;
        int profit=0;

        for (int right = 1; right < prices.length; right++) {
            if (prices[right] > prices[left]) {
                profit = Math.max(profit, prices[right] - prices[left]);
            }else {
                left=right;
            }
        }
      return profit;
    }
}
