class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        generate(1,9,n,k,res,new ArrayList());
        return res;
    }
    void generate(int start,int end,int target,int k,List<List<Integer>> res,List<Integer> curr)
    {
        if(curr.size()==k && target==0)
        {
            res.add(new ArrayList(curr));
        }
        for(int i=start;i<=end;i++)
        {
            curr.add(i);
            generate(i+1,9,target-i,k,res,curr);
            curr.remove(curr.size()-1);
        }
    }
}