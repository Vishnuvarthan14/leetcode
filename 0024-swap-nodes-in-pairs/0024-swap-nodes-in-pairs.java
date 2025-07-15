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
    public ListNode swapPairs(ListNode head) {
        
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
            int tempVal = temp.val;
            temp.val=temp.next.val;
            temp.next.val=tempVal;
            temp=temp.next.next;
            }
            else
            temp=temp.next;
        }

        return head;
    }
}