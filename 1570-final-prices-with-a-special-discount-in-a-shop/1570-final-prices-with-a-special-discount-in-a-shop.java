class Solution {
    public int[] finalPrices(int[] prices) {
        Stack <Integer> stack= new Stack<>();
        int arr[] = new int [prices.length];
    

        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&prices[i]<=prices[stack.peek()])
            {
                int ind=stack.pop();
                arr[ind]=prices[i];
            }
            stack.push(i);
        }

       // System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            prices[i]-=arr[i];
        }
        return prices;
    }
}