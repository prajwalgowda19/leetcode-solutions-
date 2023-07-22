class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
          int anss=check(nums1[i],nums2);
          ans[i]=anss;
        }
return ans;
    }
    public  int check(int ele,int[] nums)
    {
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            if(ele==nums[i])
              flag=true;

              if(flag)
              {
                if(ele<nums[i])
                return nums[i];
              }
                
        
        }
        return -1;
    }
}