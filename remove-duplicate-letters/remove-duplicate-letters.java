class Solution {
       public String removeDuplicateLetters(String s) {
        int[] record = new int[26];
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            record[arr[i] - 'a']++;
        }
        boolean[] added = new boolean[26];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i] - 'a';
            if(added[j]) {
                record[j]--;
                continue;
            }
            while(!list.isEmpty() && j < list.getLast() && record[list.getLast()] != 0) {
                added[list.removeLast()] = false;
            }
            list.add(j);
            added[j] = true;
            record[j]--;
        }
        StringBuilder sb = new StringBuilder();
        while (!list.isEmpty()) {
            sb.append((char) ('a' + list.removeFirst()));
        }
        return sb.toString();
    }
}