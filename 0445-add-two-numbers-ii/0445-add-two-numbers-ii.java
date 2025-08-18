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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        l1=reverse(l1);
        l2=reverse(l2);

        ListNode dummy = new ListNode();
        ListNode tail=dummy;

        int carry=0;
        while(l1!=null&&l2!=null)
        {
            int ans=l1.val+l2.val+carry;
            ListNode temp=new ListNode(ans%10);
            tail.next=temp;
            tail=tail.next;
            carry=ans/10;

            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null)
        {
            int ans=l1.val+carry;
            ListNode temp=new ListNode(ans%10);
            tail.next=temp;
            tail=tail.next;
            carry=ans/10;

            l1=l1.next;
        }

        while(l2!=null)
        {
            int ans=l2.val+carry;
            ListNode temp=new ListNode(ans%10);
            tail.next=temp;
            tail=tail.next;
            carry=ans/10;

            l2=l2.next;
        }
        if(carry==1)
        {
            tail.next=new ListNode(carry);
            tail=tail.next;
        }

            return reverse( dummy.next);
    }

    private ListNode reverse(ListNode head)
    {
        ListNode curr=head;
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