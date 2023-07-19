class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int pi=0;
        int ni=1;
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]<0 && ni<nums.length)
            {
                ans[ni]=nums[i];
                ni=ni+2;
                i++;
            }
            else if(nums[i]>0 && pi<nums.length)
            {
                ans[pi]=nums[i];
                pi=pi+2;
                i++;
            }
        }
  return ans;
    }
}