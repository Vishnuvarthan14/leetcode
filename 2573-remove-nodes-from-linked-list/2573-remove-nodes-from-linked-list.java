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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode dummy=new ListNode();
        ListNode tail=dummy;

        int max = head.val;
        while(head!=null)
        {
                max=Math.max(max,head.val);
                if(max==head.val)
                {
                    tail.next=head;
                    tail=head;
                }
                head=head.next;
        }

        tail.next=null;
        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode node)
    {
        ListNode curr=node;
        ListNode prev=null;
        ListNode next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}