class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        bt(nums,res,new ArrayList<>());
        return res;
    }
    void bt(int[] nums, List<List<Integer>> res,ArrayList<Integer> curr)
    {
        if(curr.size()==nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(curr.contains(nums[i]))
                continue;
            curr.add(nums[i]);
            bt(nums,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}