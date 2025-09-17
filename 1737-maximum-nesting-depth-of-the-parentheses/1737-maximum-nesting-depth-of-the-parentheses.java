class Solution {
    public int maxDepth(String s) {
        Stack <Character> stack = new Stack<>();
        int max=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
                stack.push(c);
            else if(c==')')
            {
                max=Math.max(max,stack.size());
                    stack.pop();        
            }
            //System.out.println(stack);
        }
        return max;
    }
}