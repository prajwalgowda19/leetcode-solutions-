class Solution {
     public boolean rotateString(String s, String goal) {
       return (s.length()==goal.length() && (s+s).contains(goal)); 
    }
}

// my original code O(n^2) duplicate and check whether it is present 
//  public boolean rotateString(String s, String goal) {
//         if(s.length()!=goal.length())
//         {
//             return false;
//         }
//     String dup=s+s;
// for(int i=0;i<dup.length();i++)
// {
//     for(int j=i;j<dup.length();j++)
//     {
//         if(goal.equals(dup.substring(i,j)))
//         {
//             return true;
//         }
//     }
// }
//         return false;
//     }