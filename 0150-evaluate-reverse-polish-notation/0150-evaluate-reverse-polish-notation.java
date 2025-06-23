class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack <Integer> stack = new Stack<>();

        for(int i=0;i<tokens.length;i++)
        {
            String s=tokens[i];
            if(!(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")))
            {
                stack.push(Integer.parseInt(s));
            }
            else
            {
                if(s.equals("+"))
                {
                    int a=stack.pop();
                    int b=stack.pop();
                    int temp =b+a;
                    stack.push(temp);
                }
                else if(s.equals("-"))
                {
                  int a=stack.pop();
                    int b=stack.pop();
                    int temp =b-a;
                    stack.push(temp);
                }
                else if(s.equals("*"))
                {
                   int a=stack.pop();
                    int b=stack.pop();
                    int temp =b*a;
                    stack.push(temp);
                }
                else if(s.equals("/"))
                {
                    int a=stack.pop();
                    int b=stack.pop();
                    int temp =b/a;
                    stack.push(temp);
                }
            }
            
        } 
        
        return stack.peek();
    }
}