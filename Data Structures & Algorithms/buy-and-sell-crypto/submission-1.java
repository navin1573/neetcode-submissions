class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int low = prices[0];
       for(int i=0;i<prices.length;i++){
        if(prices[i]==low) continue;
          maxProfit = Math.max(maxProfit,prices[i]-low);
          low = Math.min(low,prices[i]);
       }
       return maxProfit; 
    }
}
