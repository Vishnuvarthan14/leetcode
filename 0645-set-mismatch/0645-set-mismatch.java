class Solution {
    public int[] findErrorNums(int[] nums) {
        int freq[] = new int[nums.length+1];
        int arr[] = new int[2];
        for(int i :nums)
        {
            freq[i]++;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(freq[i]==2)
                arr[0]=i;
            else if(freq[i]==0)
                arr[1]=i;
        }
        return arr;
    }
}