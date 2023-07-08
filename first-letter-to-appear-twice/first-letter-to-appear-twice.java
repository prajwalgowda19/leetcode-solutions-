class Solution {
   public char repeatedCharacter(String s) {
   char ans=' ';
   int minindex=0;
   HashMap<Character,Integer> map=new HashMap<>();
   for(int i=0;i<s.length();i++)
   {
       if(!map.containsKey(s.charAt(i))) {
           map.put(s.charAt(i), i);
       }

       else{
           int previndex=map.get(s.charAt(i));
           int currindex=i;
           if(minindex==0)
           {
               minindex=currindex-previndex;
               ans=s.charAt(i);
               break;
           }

       }
   }
   return ans;
    }
}