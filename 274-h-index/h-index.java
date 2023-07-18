class Solution {
    public int hIndex(int[] citations) {
        int ans=0;
        int n=citations.length;
        int i=0;
       while(i<=n)
        {
            if(checkit(citations,i))
                ans=Math.max(ans,i);
            i++;
        }
       return ans;

    }
    boolean checkit(int[] nums,int number)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=number)
                count++;
        }
        if(count>=number)
            return true;
        else
            return false;
    }
}