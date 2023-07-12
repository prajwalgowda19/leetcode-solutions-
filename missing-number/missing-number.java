class Solution {
    public int missingNumber(int[] nums)
    {
        int i=0;
        while(i< nums.length) {
//            int correct=arr[i]
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(i, nums[i], nums);
            } else {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index)
            {
                return index;
            }
        }
        return nums.length;

    }
    static void swap(int a,int b,int[] arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}