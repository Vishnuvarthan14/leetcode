/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    private void helper(Node root1,Node root2)
    {
        if(root1.right==null)
        return;

        root1.right.next=root2.left;
        helper(root1.right,root2.left);
    }
    public Node connect(Node root) {
        if(root==null)
            return root;
        connectList(root.left,root.right);
        return root;
    }

    public void connectList(Node root1,Node root2)
    {
        if(root1==null)
            return ;

        root1.next=root2;
        if(root1.left!=null)
        {
        helper(root1,root2);
        connectList(root1.left,root1.right);
        connectList(root2.left,root2.right);
        }

    }
}