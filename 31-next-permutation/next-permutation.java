class Solution {
    public void nextPermutation(int[] nums) {
        int k=nums.length-2;
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]<=nums[i-1]) k--;
            else{
                break;
            }
        }
        if(k==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
         for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]>nums[k])
            {
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                break;
            }
        }
        reverse(nums,k+1,nums.length-1);
        return;
    }
    void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
          int temp=nums[start];
         nums[start]=nums[end];
         nums[end]=temp;
         start++;
         end--;
        }
    }
}