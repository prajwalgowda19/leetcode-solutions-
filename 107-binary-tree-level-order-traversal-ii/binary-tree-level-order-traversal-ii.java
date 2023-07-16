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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> list=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                 if(curr.right!=null) q.add(curr.right);
                 list.add(curr.val);
            }
            res.add(list);
        }
         List<List<Integer>> res1=new ArrayList();
        for(int i=res.size()-1;i>=0;i--)
        {
            res1.add(new ArrayList(res.get(i)));
        }

        return res1;
    }
}