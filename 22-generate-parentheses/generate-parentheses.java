class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generate("(",1,0,n,res);
        return res;
    }
    void generate(String curr,int o,int c,int n,List<String> res)
    {
        if(curr.length()==n*2)
        res.add(curr);



           if(o<n) 
           generate(curr+"(",o+1,c,n,res);
           if(c<o)
           generate(curr+")",o,c+1,n,res);

    }
}