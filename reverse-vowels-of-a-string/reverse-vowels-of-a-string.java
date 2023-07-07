class Solution {
     public String reverseVowels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
           map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        map.put('A',1);
        map.put('E',1);
        map.put('I',1);
        map.put('O',1);
        map.put('U',1);
        int i=0;
        char[] res=s.toCharArray();
     int j=res.length-1;
        while(i<j)
        {

            if(map.containsKey(res[i]))
        {
            char temp;
            if (map.containsKey(res[j]))
            {
                temp=res[i];
                res[i]=res[j];
                res[j]=temp;
                i++;
                j--;
                continue;
            }
            else{
                j--;
            }
        }
            else{
                i++;
            }

        }
        String ans=new String(res);

return  ans;
          }
}