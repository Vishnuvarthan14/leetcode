class Solution {
    public boolean backspaceCompare(String s, String t) {
        return backSpace(s).equals(backSpace(t));
    }

    public String backSpace(String s)
    {
        Stack <Character> stack = new Stack<>();

        for(char c:s.toCharArray())
        {
            if(stack.isEmpty())
            {
                if(c!='#')
                 stack.push(c);
            }
               
            else
            {
                if(c=='#')
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        System.out.println(stack);
        String ans="";
        for(char c:stack)
            ans+=c;

        return ans;
    }
}