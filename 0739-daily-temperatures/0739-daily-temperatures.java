class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int arr[] = new int[n];

        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(temp[i]<temp[j])
        //         {
        //             arr[i]=(j-i);
        //             break;
        //         }
        //     }
        // }

        Stack <Integer> stack = new Stack<>();

        for(int i=0;i<n;i++)
        {
                while(!stack.isEmpty()&&temp[stack.peek()]<temp[i])
                    {
                        arr[stack.peek()]=i-stack.peek();
                        stack.pop();
                    }
                    stack.push(i);  
        }
        return arr;
    }
}