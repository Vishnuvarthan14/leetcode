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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int size=0;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }

        size-=1;
        int sum=0;
        int pow=(int) Math.pow(2,size);
        for(int i=pow;i>=0&&head!=null;i=i/2)
        {
            sum+=head.val*i;
            //System.out.println(i);
            head=head.next;    
        }
        return sum;
    }
}