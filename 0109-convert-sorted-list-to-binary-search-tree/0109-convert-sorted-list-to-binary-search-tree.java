/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        ArrayList <Integer> list = new ArrayList<>();
        listify(list,head);
        return populate(list,0,list.size()-1);
    }

    public void listify(ArrayList<Integer> list,ListNode temp)
    {
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
            }
    }

    public TreeNode populate(ArrayList<Integer> list,int s,int e)
    {
        if(s>e)
        return null;

            int mid =s+(e-s)/2;

            TreeNode root = new TreeNode(list.get(mid));

             root.left= populate(list,s,mid-1);
            root.right=populate(list,mid+1,e);

            return root;
    }



}