class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count=1;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                if(count==1)
                    return nums[i];
                else
                    count=1;
            }
            else
                count++;
        }
        return nums[nums.length-1];
    }
}