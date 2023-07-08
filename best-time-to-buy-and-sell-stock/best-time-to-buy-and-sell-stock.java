class Solution {
 public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
     int minsofar=prices[0];
     int maxprofit=0;
     for(int i=1;i<prices.length;i++)
     {
         minsofar=Math.min(minsofar,prices[i]);
         maxprofit=Math.max(maxprofit,prices[i]-minsofar);
     }
     return maxprofit;
    }
}