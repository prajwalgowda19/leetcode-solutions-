class Solution {
   public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
   for(int i=0;i<s2.length()-s1.length()+1;i++)
   {
      if(check(i,i+s1.length()-1,s2,s1))
          return true;
   }
   return false;
    }

    boolean check(int start,int end,String s,String org)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<org.length();i++)
        {
            if(!map.containsKey(org.charAt(i)))
                map.put(org.charAt(i),1);
            else{
                int count=map.get(org.charAt(i));
                count++;
                map.put(org.charAt(i),count);
            }
        }
        for(int i=start;i<=end;i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i))!=0) {
                    int count = map.get(s.charAt(i));
                    count--;
                    map.put(s.charAt(i),count);
                }
                else return false;
            }
            else return false;
        }

        return true;
    }
}