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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null)
        {
            temp=temp.next;
            n++;
        }
        int arr[] = new int[n];
        int ans[] = new int[n];

        temp=head;
        for(int i=0;i<n;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        Stack <Integer> stack = new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i])
            {
                ans[stack.pop()]=arr[i];
            }
            stack.push(i);
        }

        return ans;
    }
}