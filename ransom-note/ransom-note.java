class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(!map.containsKey(magazine.charAt(i)))
            {
                map.put(magazine.charAt(i),1);
            }
            else {
                int count=map.get(magazine.charAt(i));
                count=count+1;
                map.put(magazine.charAt(i),count);
            }
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(map.containsKey(ransomNote.charAt(i))&& map.get(ransomNote.charAt(i))!=0)
            {
                int count=map.get(ransomNote.charAt(i));
                count=count-1;
                map.put(ransomNote.charAt(i),count);
            }
            else return false;
        }
return true;
    }
}
