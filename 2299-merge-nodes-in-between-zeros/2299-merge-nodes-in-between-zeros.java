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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode tail=dummy;
        int sum=0;
        while(head!=null)
        {
            //System.out.println(head.val);
            if(head.val==0){
                ListNode temp=new ListNode(sum);
                tail.next=temp;
                tail=tail.next;
                // System.out.println(sum);
                sum=0;
            }
            sum+=head.val;
            head=head.next;

        }
        return dummy.next.next;
    }
}