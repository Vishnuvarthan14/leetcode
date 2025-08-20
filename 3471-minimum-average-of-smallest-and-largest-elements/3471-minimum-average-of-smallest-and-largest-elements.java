class Solution {
    public double minimumAverage(int[] nums) {
        
        Arrays.sort(nums);
        double min=Integer.MAX_VALUE;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            min=Math.min(((float)nums[i]+(float)nums[j])/2,min);
            i++;
            j--;
        }

        return min;
    }
}