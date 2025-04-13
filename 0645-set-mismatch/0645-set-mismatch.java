class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int freq[]=new int[nums.length+1];
        int arr[]={-1,-1};
        for(int i:nums) freq[i]++;

        for(int i=1;i<nums.length+1;i++)
        {
            if(freq[i]==2)
                {
                    arr[0]=i;
                }
        }
        for(int i=1;i<nums.length+1;i++)
        {
            if(freq[i]==0)
                {
                    arr[1]=i;
                }
        }
        return arr;
    }
}