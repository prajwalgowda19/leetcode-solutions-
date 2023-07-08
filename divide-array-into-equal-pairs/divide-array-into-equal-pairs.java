class Solution {
      public boolean divideArray(int[] nums) {
        if(nums.length%2!=0) return false;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i=i+2)
        {
            int j=i+1;
            if(nums[i]!=nums[j])
                return false;
        }
return true;
    }
}