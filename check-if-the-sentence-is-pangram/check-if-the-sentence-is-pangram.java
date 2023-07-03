class Solution {
   public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<sentence.length();i++)
        {
            map.put(sentence.charAt(i),1);
        }
        for(char i='a';i<='z';i++)
        {
            if(!map.containsKey(i))
            {
                return false;
            }
        }
        return true;
    }
}