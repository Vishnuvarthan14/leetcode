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
    public void flatten(TreeNode root) {
        if(root==null)
        return;
        
        Stack <Integer> stack=new Stack<>();
        dfs(stack,root);
        stack.pop();
        TreeNode temp=root;
        while(!stack.isEmpty())
        {
            temp.left=null;
            temp.right=new TreeNode(stack.pop());
            temp=temp.right;
        }
    }
    private void dfs(Stack<Integer> stack,TreeNode root)
    {
        if(root==null)
        return;

        dfs(stack,root.right);
        dfs(stack,root.left);

        stack.push(root.val);
    }
}