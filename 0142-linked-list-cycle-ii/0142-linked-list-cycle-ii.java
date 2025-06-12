/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        List <ListNode> map = new ArrayList<>();
        while(fast!=null&&fast.next!=null)
        {
                if(!map.contains(slow))
                {
                    map.add(slow);
                }
                else
                {
                    return slow;
                }
                slow=slow.next;
                fast=fast.next.next;
        }
        return null;
    }
}