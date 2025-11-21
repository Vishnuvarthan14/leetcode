class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+"))
            {
                int temp=stack.pop();
                stack.push(temp+stack.pop());
            }
            else if(s.equals("*"))
            {
                int temp=stack.pop();
                stack.push(temp*stack.pop());
            }
            else if(s.equals("-"))
            {
                int temp=stack.pop();
                stack.push(stack.pop()-temp);
            }
            else if(s.equals("/"))
            {
                int temp=stack.pop();
                stack.push(stack.pop()/temp);
            }
            else
                stack.push(Integer.parseInt(s));
            //System.out.println(stack);
        }
       
        return stack.pop();
    }
}