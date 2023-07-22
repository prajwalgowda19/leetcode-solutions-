class Solution {
    public List<List<Integer>> permuteUnique(int[] nums)  {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        bt(nums,res,new ArrayList<>(),used);
        return res;
    }
    void bt(int[] nums, List<List<Integer>> res,ArrayList<Integer> curr,boolean[] used)
    {
        if(curr.size()==nums.length && !res.contains(curr))
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(used[i])
                continue;
            used[i]=true;
            curr.add(nums[i]);
            bt(nums,res,curr,used);
            used[i]=false;
            curr.remove(curr.size()-1);
        }
    }
}