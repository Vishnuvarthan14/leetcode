class Solution {
    public int calPoints(String[] arr) {
        
        Stack <Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].charAt(0)>='0'&&arr[i].charAt(0)<='9'||arr[i].charAt(0)=='-'){
                int score=Integer.parseInt(arr[i]);
                stack.push(score);
            }
            else if(arr[i].equals("C"))
            {
                stack.pop();
            }
            else if(arr[i].equals("D"))
            {
                stack.push(stack.peek()*2);
            }

            else if(arr[i].equals("+"))
            {
                int temp=stack.peek();
                stack.pop();
                int temp1=stack.peek();
                stack.push(temp);
                stack.push(temp+temp1);
            }
        }
      //  System.out.println(stack);
        int sum=0;
        for(int i:stack)
            sum+=i;
        return sum;
    }
}