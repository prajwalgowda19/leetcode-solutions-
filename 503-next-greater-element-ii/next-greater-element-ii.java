class Solution {
      public int[] nextGreaterElements(int[] nums) {
        int[] checker=new int[nums.length+nums.length];
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            checker[i]=nums[i];
            checker[i+nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
           int anss=checkit(nums[i],checker,i);
           ans[i]=anss;

        }
        return ans;
    }
    int checkit(int ele,int[] checker,int start)
    {
        boolean flag=false;
        for(int i=start;i<checker.length;i++)
        {
                if(ele<checker[i])
                    return checker[i];
        }
        return -1;
    }
}