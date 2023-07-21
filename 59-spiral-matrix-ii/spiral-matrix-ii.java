class Solution {
    public int[][] generateMatrix(int n) {

        int[][] a=new int[n][n];
        int row=a.length,col=a[0].length;
        int l=0,r=col-1,t=0,b=row-1,d=0;
        int count =1;
        while(l<=r && t<=b)
        {
        if(d==0)
        {
        for(int i=l;i<=r;i++)
        {
            a[t][i]=count;
            count++;
        }
        d=1;
        t++;
        }
        else if(d==1)
        {
        for(int i=t;i<=b;i++)
        {
            a[i][r]=count;
            count++;
        }
        d=2;
        r--;
        }
        else if(d==2)
        {
        for(int i=r;i>=l;i--)
        {
            a[b][i]=count;
            count++;
        }
        d=3;
        b--;
        }
        else if(d==3)
        {
        for(int i=b;i>=t;i--)
        {
            a[i][l]=count;
            count++;
        }
        d=0;
        l++;
        }
        }
     return a;
    }
}