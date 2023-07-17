class Solution {
//    public static void main(String[] args) {
//        Solution s=new Solution();
//         boolean ans =s.isPowerOfTwo(20);
//        System.out.println(ans);
//    }
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
     if((n&(n-1))==0)
     return true;
     else return false;
    }
}



//       while(n>1)
//         {
//             if(n%2!=0) return false;
//             n=n/2;
//         }
//       if(n==1) return true;
// return false;