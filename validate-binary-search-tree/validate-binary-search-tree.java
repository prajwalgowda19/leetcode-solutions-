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
    public boolean isValidBST(TreeNode root) {
        return ans(root, Long.MIN_VALUE,Long.MAX_VALUE);
}
boolean ans(TreeNode root,long minval,long maxval)
{
if(root==null) return true;
if(root.val>=maxval || root.val<=minval)
return false;
return ans(root.left,minval,root.val) && ans(root.right,root.val,maxval);
}
}