class Solution {
    public String makeGood(String s) {
        
        Stack <Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(stack.isEmpty())
                stack.push(c);
            else
            {
                if(stack.peek()-32==c||stack.peek()+32==c)
                     stack.pop();
                else
                    stack.push(c);
            }
        }
        String ans="";
        for(char c:stack)
            ans+=c;
        return ans;

    }
}