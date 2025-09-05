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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[]= {-1,-1};
        if(head==null||head.next==null||head.next.next==null)
            return ans;

        ListNode temp=head;
        ListNode curr=head.next;
        int ind=2;
        List <Integer> list =  new ArrayList<>();
        while(curr.next!=null)
        {  
            if((temp.val>curr.val&&curr.val<curr.next.val)||(temp.val<curr.val&&curr.val>curr.next.val))
                list.add(ind);
            curr=curr.next;
            temp=temp.next;
             ind++;
        }
        if(list.size()<=1)
        return ans;

        Collections.sort(list);

       // System.out.println(list);
        int n=list.size()-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            min=Math.min(min,list.get(i+1)-list.get(i));
        ans[0]=min;
        ans[1]=list.get(n)-list.get(0);

        return ans;
    }
}