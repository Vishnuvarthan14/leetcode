class Solution {
    public int minOperations(int[] nums) {
        int count=0;
        int gcd=0;
        for(int i:nums)
        {
            if(i==1)
            count++;
            gcd=gcd(gcd,i);
        }
        if(count>0)
            return nums.length-count;
        if(gcd!=1)
            return -1;

        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            gcd=0;
            for(int j=i;j<nums.length;j++)
            {
                if((gcd=gcd(gcd,nums[j]))==1)
                {
                    min=Math.min(min,j-i+1);
                    break;
                }
            }
        }
        return min+nums.length-2;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}