class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        if(nums.length==1)
        return nums[0];

        dp[0]=nums[0];
        if(dp[0]>nums[1])
            dp[1]=dp[0];
        else
            dp[1]=nums[1];

        for(int i=2;i<nums.length;i++)
        {
            int sum=0;
            sum=nums[i]+dp[i-2];
            if(sum>dp[i-1])
                dp[i]=sum;
            else
                dp[i]=dp[i-1];
        }
        return dp[dp.length-1];
    }
}