class Solution {
      public void rotate(int[] nums, int k) {
        if(k==0) return;
        reverse(nums,0,nums.length-1);
        if(nums.length<k) {
            k=k%nums.length;
          reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        return;
        }
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
    void reverse(int[] nums,int start,int end){
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