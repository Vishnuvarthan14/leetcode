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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode();
        if(lists.length==0)
            return dummy.next;
        if(lists.length==1)
            return lists[0];

        for(int i=0;i<lists.length;i++)
        {
            dummy.next=merge(dummy.next,lists[i]);
        }
        return dummy.next;
    }

    public ListNode merge(ListNode list1,ListNode list2)
    {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<list2.val)
                {
                    tail.next=list1;
                    list1=list1.next;
                    tail=tail.next;
                }
            else
                {
                    tail.next=list2;
                    list2=list2.next;
                    tail=tail.next;
                }
        }
        if(list1!=null)
            tail.next=list1;
        if(list2!=null)
            tail.next=list2;
        
        return dummy.next;
    }
}