class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        generate(0,nums,new ArrayList(),res);
        return res;
    }
    void generate(int index,int[] nums, List<Integer> curr, List<List<Integer>> res)
    {
        res.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++)
        {
            curr.add(nums[i]);
            generate(i+1,nums,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}