class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];

        int maxProfit = 0;

        for(int i = 0; i < prices.length; ++i){
            minPrice = Math.min(minPrice, prices[i]); // buying price

            int profit = prices[i] - minPrice;
            if(profit < 0){
                return 0;
            }
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
