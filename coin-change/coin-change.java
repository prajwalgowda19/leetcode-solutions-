class Solution {
  public int coinChange(int[] coins, int amount) {
  if(amount==0 || coins.length==0) return 0;
  if(coins.length==1)
  {

  }
  int[] dp=new int[amount+1];
  Arrays.fill(dp,amount+1);
  dp[0]=0;
  for(int j=0;j<coins.length;j++ )
  {
      for(int i=coins[j];i<=amount;i++)
      {
          dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
      }
  }
  if(dp[amount]<=amount)
    return dp[dp.length-1];   
    else return -1;
    }
}