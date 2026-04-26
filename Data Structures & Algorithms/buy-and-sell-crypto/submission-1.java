class Solution {
    public int maxProfit(int[] prices) {

       int left = 0;
       int right = 1; 
       int max_profit = 0;

       // buy with lowest prices 
       // sell with hightest prices

       while( right < prices.length ){

          if( prices[left] > prices[right] ){
            left = right;
          }
          else{
            int high_value = prices[right] - prices[left];
            max_profit = Math.max( max_profit , high_value );
          }
          right++;
       }
       return max_profit;
    }
}
