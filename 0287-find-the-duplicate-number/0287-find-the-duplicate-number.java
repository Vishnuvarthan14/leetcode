class Solution {
    public int findDuplicate(int[] nums) {
        
        int freq[] = new int[nums.length];

        for(int i:nums)
        {
            freq[i]++;
        }
       //System.out.println(Arrays.toString(freq));
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]>1)
                return i;
        }
        return -1;
    }
}