class Solution {
      public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length/3;
        for(int i=0;i<nums.length;i++)
        {
           if(!map.containsKey(nums[i]))
           {
               map.put(nums[i],1);
           }
           else {
               int count =map.get(nums[i]);
               count++;
               map.put(nums[i],count);
           }
        }
        for(int i=0;i<nums.length;i++)
        {
          if( map.get(nums[i])>n)
             if(!list.contains(nums[i]))
                 list.add(nums[i]);
        }
        return list;
    }
}