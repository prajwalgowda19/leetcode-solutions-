class Solution {
    public int bulbSwitch(int n) {
        if(n==0) return 0;
        int ans=1;
        for(int i=1;i<n;i++)
        {
            if(Math.pow(i,2)<=n)
            ans=i;
        }
            return ans;
    }

}