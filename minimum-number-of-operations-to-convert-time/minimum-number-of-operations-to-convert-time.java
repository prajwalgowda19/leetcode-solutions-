class Solution {
    public int convertTime(String current, String correct) {
         int currmin=getmin(current);
         int corrmin=getmin(correct);
         int find=corrmin-currmin;
         int count=0;
         while(find!=0)
         {
             if(find>=60)
             {
                 count=count+find/60;
                 find=find%60;
                 continue;
             }
             if(find>=15)
             {
                 count=count+find/15;
                 find=find%15;
                 continue;
             }
             if(find>=5)
             {
                 count=count+find/5;
                 find=find%5;
                 continue;
             }
             if(find>=1)
             {
                 count=count+find/1;
                 find=find%1;
                 continue;
             }
         }
   return count;
    }
    public int getmin(String time)
    {
        String[] arr=time.split(":");
        int hours=Integer.parseInt(arr[0]);
        int min=Integer.parseInt(arr[1]);
        int res=(hours*60)+min;
        return res;
    }
}