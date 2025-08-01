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
class Solution {
    public void reorderList(ListNode head) {

        if(head==null||head.next==null||head.next.next==null)
        return;

        Stack <ListNode> stack = new Stack<>();

        ListNode temp = head;

        int size=0;
        while(temp!=null)
        {
            stack.push(temp);
            size++;
            temp=temp.next;
        }

        
        if(size%2==0)
        {
            ListNode f=head;
            ListNode s=head.next;
            for(int i=0;i<size/2;i++)
            {
                // System.out.println(f.val);
                ListNode node=stack.pop();
                f.next=node;
                node.next=s;
                f=s;
                s=s.next;
            }
            f.next=null;
        }
        else
        {
            ListNode f=head;
            ListNode s=head.next;
            for(int i=0;i<size/2;i++)
            {
                // System.out.println(f.val);
                ListNode node=stack.pop();
                f.next=node;
                node.next=s;
                f=s;
                s=s.next;
            }
            f.next=null;
            s.next=f;
        }

    }
}