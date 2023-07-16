class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> inOrder = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        
        while(!s.isEmpty()|| node!=null){
            
            if(node != null){
                s.push(node);
                node = node.left;
            }
            else{
                node = s.pop();
                inOrder.add(node.val);
                node = node.right;
            }
        }
        
        return inOrder;
    }
}