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
    public ListNode deleteDuplicates(ListNode head) {
        
        HashMap <Integer,Integer> map = new HashMap<>();

        ListNode temp=head;

        while(temp!=null)
        {
            if(map.containsKey(temp.val))
            {
                map.put(temp.val,map.get(temp.val)+1);
            }
            else
            map.put(temp.val,1);

            temp=temp.next;
        }
        temp=head;
        ListNode dummy = new ListNode();
        ListNode tail=dummy;

        while(temp!=null)
        {
            if(map.get(temp.val)==1)
            {
                tail.next=temp;
                tail=tail.next;
            }
            
            temp=temp.next;
        }
        tail.next=null;

        return dummy.next;
    }
}