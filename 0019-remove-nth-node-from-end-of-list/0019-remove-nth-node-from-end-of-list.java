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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null||head.next==null)
            return null;
        ListNode temp =head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        temp=head;
       if(size-n == 0) return head.next;
        for(int i=1;i<size-n;i++)
        {
            temp=temp.next;
        }
        // System.out.println(temp.val);
        temp.next=temp.next.next;
        return head;
    }
}