class Solution {
    public int findMin(int[] nums) {
         int min=Integer.MAX_VALUE;
        for(int i:nums)
        {
            min=(min>i)?i:min;
        }
        return min;
    }
}