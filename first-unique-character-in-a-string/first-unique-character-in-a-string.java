import java.util.HashMap;

class Solution {
//    public static void main(String[] args) {
//        Solution s=new Solution();
//       int ans=s.firstUniqChar("leetcode");
//        System.out.println(ans);
//    }
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i]);
                count=count+1;
                map.put(arr[i],count);
            }
            else map.put(arr[i],1);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==1)
                return i;
        }
        return -1;
    }
}