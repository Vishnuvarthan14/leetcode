class Solution {
    public String simplifyPath(String path) {
        
        String arr[] = path.split("/");

        Stack <String> stack = new Stack <>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()!=0)
            {
                if(arr[i].equals("."))
                    continue;
                else if(arr[i].equals(".."))
                {
                    if(stack.isEmpty())
                        continue;
                    stack.pop();
                }
                else
                {
                    stack.push(arr[i]);
                }
            }
        }
        
        if(stack.isEmpty())
            return "/";

        String ans="";
        for(String c:stack)
            ans=ans+"/"+c;

        return ans;
    }
}