/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
          List<List<Integer>> finlist=new ArrayList<>();
        if(root==null) return finlist;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            List<Integer> list=new ArrayList<>();
            while(size-->0)
            {
                   TreeNode curr=qu.poll();
                   list.add(curr.val);
                   if(curr.left!=null) qu.offer(curr.left);
                   if(curr.right!=null) qu.offer(curr.right);
            }
            finlist.add(list);
        }
return finlist;
    }
}