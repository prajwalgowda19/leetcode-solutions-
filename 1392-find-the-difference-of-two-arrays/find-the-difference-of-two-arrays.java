class Solution {
 public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
      for(int i:set1)
      {
          if(!set2.contains(i))
              list1.add(i);
      }
        for(int i:set2)
        {
            if(!set1.contains(i))
                list2.add(i);
        }
        res.add(list1);
        res.add(list2);
        return res;
    }
}