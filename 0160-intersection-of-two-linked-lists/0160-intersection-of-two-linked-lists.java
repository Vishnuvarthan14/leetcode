/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;

        int size1=0,size2=0;

        while(temp1!=null){
            size1++;
            temp1=temp1.next;
        }
        while(temp2!=null){
            size2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        int diff=Math.abs(size1-size2);
      //  System.out.println(diff);

        if(size1>size2)
            temp1=traverse(temp1,diff);
        else
            temp2=traverse(temp2,diff);

        while(temp1!=null&&temp2!=null)
        {
            if(temp1==temp2)
                return temp1;
            temp1=temp1.next;
            temp2=temp2.next;
        }
       return null;

    }
    public ListNode traverse(ListNode head,int diff)
    {
            for(int i=0;i<diff;i++)
            {
                head=head.next;
            }
            System.out.println(head.val);
            return head;
    }
}