class Solution {
    public int maxProfit(int[] prices) {

        int l = 0;
        int r = 0;
        
        int maxProfit = 0;

        while(r < prices.length){
            int buyValue = prices[l];
            int sellValue = prices[r];
            if(buyValue < sellValue){
                int profit = sellValue - buyValue;

                if(profit < 0){
                    maxProfit = 0;
                }

                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                l = r;
            }

            r++;
        }
        return maxProfit;
    }
}
