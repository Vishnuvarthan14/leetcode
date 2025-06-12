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

        HashMap <ListNode,Integer> map = new HashMap<>();
        int i=0;
        while(fast!=null&&fast.next!=null)
        {
                if(!map.containsKey(slow))
                {
                    map.put(slow,i++);
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