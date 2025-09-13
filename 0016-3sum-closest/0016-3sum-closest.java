class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min_abs=Integer.MAX_VALUE;
        int min=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<0&&nums[i]==nums[i-1])
               continue;

            int start=i+1;
            int end=nums.length-1;
            
            while(start<end)
            {
                int total=nums[i]+nums[start]+nums[end];
                
                if(total>target)
                    end--;
                else if(total<target)
                    start++;
                else 
                return target;

                int abs=Math.abs(total-target);
                if(min_abs>abs)
                    {
                        min_abs=abs;
                        min=total;
                    }
                    
                    // while(start<end&&nums[start]==nums[start-1])
                    //     start++;
            }
        }
            return min;
    }
}