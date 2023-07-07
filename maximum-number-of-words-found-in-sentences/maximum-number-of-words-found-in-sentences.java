class Solution {
     public int mostWordsFound(String[] sentences) {
        int maxw=0;
        for(int i=0;i<sentences.length;i++)
        {
            maxw=Math.max(getnum(sentences[i]),maxw);
        }
        return maxw;
    }
    public int getnum(String s)
    {
        String[] ans=s.split(" ");
        return ans.length;
    }
}