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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
        return false;

        return hasPathSum(root,targetSum,0);
    }
     public boolean hasPathSum(TreeNode root, int targetSum,int sum) {
        
        if(root==null)
            return false;
        
        if(root.right==null&&root.left==null)
        {
            sum+=root.val;
            if(sum==targetSum)
            return true;
            else 
            return 
            false;
        }

        sum+=root.val;

        return( hasPathSum(root.left,targetSum,sum)||hasPathSum(root.right,targetSum,sum));
        
    }
}