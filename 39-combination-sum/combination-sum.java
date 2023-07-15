class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        generate(0,candidates,new ArrayList(),target,res);
        return res;
    }
    void generate(int index,int[] nums,List<Integer> curr,int target,List<List<Integer>> res)
    {
        if(target==0)
        res.add(new ArrayList(curr));
        if(target<0)
        return ;

    for(int i=index;i<nums.length;i++)
    {
        curr.add(nums[i]);
        generate(i,nums,curr,target-nums[i],res);
        curr.remove(curr.size()-1);
    }
    }
}