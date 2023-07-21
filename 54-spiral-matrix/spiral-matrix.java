class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int row=matrix.length,col=matrix[0].length;
        int l=0,r=col-1,t=0,b=row-1,d=0;
        while(l<=r && t<=b)
        {
            if(d==0)
            {
                for(int i=l;i<=r;i++)
                {
                    list.add(matrix[t][i]);
                }
              d=1;
                t++;
            }
            else if(d==1)
            {
                for(int i=t;i<=b;i++)
                {
                    list.add(matrix[i][r]);
                }
               d=2;
                r--;
            }
            else if(d==2)
            {
                for(int i=r;i>=l;i--)
                {
                    list.add(matrix[b][i]);
                }
                d=3;
                b--;
            }
            else if(d==3)
            {
                for(int i=b;i>=t;i--)
                {
                    list.add(matrix[i][l]);
                }
                d=0;
                l++;
            }
        }
        return list;
    }
}
//     l       r
//   t [1, 2, 3]      l>r d=0  t++
//     [4, 5, 6]      t>b d=1  r--
//   b [7, 8, 8]      r>l d=2  b--
//                    b>t d=3  l++