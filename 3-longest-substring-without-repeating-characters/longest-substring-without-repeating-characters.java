class Solution {
      public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int max=0;
        Set<Character> set1=new HashSet<>();
        while(right<s.length())
        {
            char c=s.charAt(right);
            if(set1.contains(c)){
                while(s.charAt(left)!=c)
                {
                    set1.remove(s.charAt(left));
                    left++;
                }
                set1.remove(c);
                left++;
            }
            else if(set1.add(c))
            {
                max=Math.max(max,right-left+1);
                right++;
            }
        }
        return max;
    }
}