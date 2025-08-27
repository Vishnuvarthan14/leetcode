class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int freq[] = new int[nums.length];
        int arr[] = new int[2];
        for(int i:nums)
            freq[i]++;
        int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]==2)
                arr[ind++]=i;
        }
        return arr;
    }
}