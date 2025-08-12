class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        System.out.println(fun(nums,goal));
        System.out.println(fun(nums,goal-1));
        return fun(nums,goal)-fun(nums,goal-1);
    }
    public int fun(int[] nums,int goal)
    {
        if(goal<0) return 0;

        int sum=0;
        int count=0;

        int i=0,j=0;

        while(j<nums.length)
        {
            sum+=nums[j];

            while(sum>goal)
            {
                sum-=nums[i];
                i++;
            }
            count+=(j-i)+1;
            j++;
        }
        return count;
    }
}