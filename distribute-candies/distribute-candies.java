class Solution {
   public int distributeCandies(int[] candyType) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            hash.add(candyType[i]);
        }
        if (candyType.length / 2 <= hash.size())
            return candyType.length / 2;
        else return hash.size();
    }
}