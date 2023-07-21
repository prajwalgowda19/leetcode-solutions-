class Solution {
    public String longestPalindrome(String s) {
        String lp="";
    for(int i=0;i<s.length();i++)
    {
        int low=i,high=i;
        while(s.charAt(low)==s.charAt(high))
        {
            low--;
            high++;

            if(low==-1 || high==s.length())
             break;
        }
        String palindrome=s.substring(low+1,high);
        if(palindrome.length()>lp.length())
            lp=palindrome;

        if(i==0)
            low=i;
        else low=i-1;
        high=i;
        while(s.charAt(low)==s.charAt(high))
        {
            low--;
            high++;

            if(low==-1 || high==s.length())
                break;
        }
        palindrome=s.substring(low+1,high);
        if(palindrome.length()>lp.length())
            lp=palindrome;

    }
    return lp;
    }
}