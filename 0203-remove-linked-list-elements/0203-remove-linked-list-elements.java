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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        
       ListNode node = new ListNode();
       ListNode tail=node;

       while(head!=null)
       {
        if(head.val!=val)
           { 
           // System.out.println(head.val);
            tail.next=head;
            tail=head;
            }
        head=head.next;
        tail.next=null;
       }

        if(node.next==null)
            return null;
        return node.next;
    }
}