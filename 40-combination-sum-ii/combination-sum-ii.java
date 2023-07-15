class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        generate(0,candidates,new ArrayList(),res,target);
return res;
    }
    void generate(int start,int[] nums,List<Integer> curr,List<List<Integer>> res,int target)
    {
        if(target==0)
        res.add(new ArrayList(curr));
        if(target<0) return;
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            generate(i+1,nums,curr,res,target-nums[i]);
            curr.remove(curr.size()-1);
        }

    }
}