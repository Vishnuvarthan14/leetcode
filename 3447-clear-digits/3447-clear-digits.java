class Solution {
    public String clearDigits(String s) {
        Stack <Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='0'&&c<='9')
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        String ans="";
        for(char c:stack)
        ans+=c;
        return ans;
    }
}