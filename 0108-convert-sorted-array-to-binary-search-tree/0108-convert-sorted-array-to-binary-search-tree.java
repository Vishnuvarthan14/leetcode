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
    TreeNode root;

    public TreeNode sortedArrayToBST(int[] nums) {
        findMid(nums,0,nums.length);
        return root;
    }
    public void populate(int val)
    {   
        root=insert(val,root);
    }
    public void findMid(int arr[],int start,int end)
    {
        if(start>=end)
        return;

        int mid=(start+end)/2;

        populate(arr[mid]);

        findMid(arr,start,mid);
        findMid(arr,mid+1,end);
    }
    public TreeNode insert(int val,TreeNode node)
    {
        if(node==null)
        {
            TreeNode temp=new TreeNode(val);
            return temp;
        }
        else if(val<node.val)
        {
            node.left=insert(val,node.left);
        }
        else if(val>node.val)
        {
             node.right=insert(val,node.right);
        }
        return node;
    }
}