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
    public ListNode rotateRight(ListNode head, int k) {
       

        if(head==null)
        return null;
        if(head.next==null)
         return head;

        int size=0;
        ListNode temp=head;
        ListNode dummy=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        temp=head;

        k=k%size;
        if(k==0)
            return head;
        for(int i=1;i<size-k;i++)
        {
            temp=temp.next;
        }
        ListNode temp1=temp;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        
        head=temp1.next;
        temp1.next=null;

        temp.next=dummy;
        //System.out.println(temp.val);
        return head;
        
    }
}