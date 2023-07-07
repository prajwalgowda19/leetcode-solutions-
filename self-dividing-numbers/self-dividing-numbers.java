class Solution {
   public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10 && i >= 0)
            {
                arr.add(i);continue;
            }
            //123
            int num = i;
            int check = 0;
            boolean flag=true;

            while (num != 0) {
                if (num < 10) {
                    if (i % num == 0) {
                        break;
                    }
                }
                    check = num % 10;
                if(check==0)
                {
                    flag=false;
                  break;
                }
                    if (i % check != 0) {
                        flag=false;
                        break;
                    }
                    num = num / 10;
                }
            if(flag==true)
                arr.add(i);

            }

            return arr;

        }
}