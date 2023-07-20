class Solution {
  public int[] rowAndMaximumOnes(int[][] mat) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int row=0;row<mat.length;row++)
        {
            int rownum=row;
            int numofones=0;
            for(int col=0;col<mat[0].length;col++)
            {
                if(mat[row][col]==1)
                    numofones++;
            }
            map.put(rownum,numofones);
        }
        int[] ansarr=new int[2];
        int max=Integer.MIN_VALUE;
        for(int row=0;row<mat.length;row++)
        {
            if(map.get(row)>max)
            {
                max=map.get(row);
                ansarr[0]=row;
                ansarr[1]=map.get(row);
            }
        }
        return ansarr;
    }
}