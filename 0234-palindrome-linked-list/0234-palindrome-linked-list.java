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
    public boolean isPalindrome(ListNode head) {
       Stack <Integer> stack = new Stack();

        ListNode temp = head;
       while(temp!=null)
       {
        stack.push(temp.val);
        temp=temp.next;
       }
        temp=head;
       while(temp!=null)
       {
        //System.out.println(stack.peek());
        if(stack.peek()==temp.val)
        {
            stack.pop();
        }
        else
            return false;
        temp=temp.next;
       }
       return true;
    }
}