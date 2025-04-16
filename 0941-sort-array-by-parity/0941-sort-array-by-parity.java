class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int arr[]=new int[nums.length];
        int k=0;
        for(int i :nums)
        {
            if(i%2==0)
                arr[k++]=i;
        }
        for(int i :nums)
        {
            if(i%2!=0)
                arr[k++]=i;
        }
        return arr;
    }
}