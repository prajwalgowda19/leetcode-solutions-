class Solution {
    public int trap(int[] height) {
    int[] left=new int[height.length];
    int[] right=new int[height.length];
    left[0]=height[0];
    right[right.length-1]=height[height.length-1];
     int total=0;

    for(int i=1;i<left.length;i++)
    {
        //calculate max from left to right
        left[i]=Math.max(left[i-1],height[i]);
    }
        for(int i=right.length-2;i>=0;i--)
        {
            //calculate max from right to left
           right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++)
        {
            //difference of bigger from smaller gives answer
            total=total+(Math.min(right[i],left[i])-height[i]);
        }
        return total;
    }
}