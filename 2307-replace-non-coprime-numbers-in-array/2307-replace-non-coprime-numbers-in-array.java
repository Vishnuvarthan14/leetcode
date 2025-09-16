class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        
        Stack <Integer> stack = new Stack<>();
        
        for(int i:nums)
        {
            stack.push(i);
            while(stack.size()>1)
            {
                int top=stack.pop();
                int prev=stack.pop();
                int gcd=gcd(top,prev);

                if(gcd!=1)
                    {
                       long lcm=(long)top*prev/gcd;
                        stack.push((int) lcm);
                    }
                else
                    {
                        stack.push(prev);
                        stack.push(top);
                        break;
                    }
            }
        }
        
        return new ArrayList<>(stack);
       
    }
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }

}
/* stack.push(nums[0]);
            for(int i=1;i<nums.length;i++)
            {
                System.out.println(stack);
                int gcd=0;
                while(i<nums.length&&(gcd=gcd(nums[i],stack.peek()))!=1)
                {
                   
                    System.out.println(gcd);
                    int prev=stack.pop();
                     System.out.println("prev-"+prev+" i-"+nums[i]);
                    long lcm=(long)prev*nums[i]/gcd;
                    System.out.println("Lcm-"+lcm);
                    stack.push((int)lcm);
                    i++;
                }
                
                if(i<nums.length)
                stack.push(nums[i]);

            }
            List <Integer> list = new ArrayList<>(stack);
        return list; */