class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<nums.length)
        {
            sum+=nums[j];
             if(sum>=target)
                    min=Math.min(min,(j-i+1));
            while(sum>target)
            {
                sum-=nums[i++];
                if(sum>=target)
                    min=Math.min(min,(j-i+1));
            }
            j++;
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}