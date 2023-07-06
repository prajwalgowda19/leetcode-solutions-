class Solution {
      public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int[] first=new int[nums.length-1];
        int[] second=new int[nums.length-1];
    for(int i=0;i<nums.length-1;i++)
    {
        first[i]=nums[i];
        second[i]=nums[i+1];
    }
    int sum1=helper(first);
    int sum2=helper(second);
    return Math.max(sum1,sum2);
    }
    public int helper(int[] num)
    {
        int[] dp=new int[num.length];
        dp[0]=num[0];
        dp[1]=Math.max(num[0],num[1]);
        for(int i=2;i<num.length;i++)
        {
            dp[i]=Math.max(num[i]+dp[i-2],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}