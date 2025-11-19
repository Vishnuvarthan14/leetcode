class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;}
            
        }
        movezero(nums);
        return nums;
    }
    public void movezero(int arr[])
    {
        int i=0,j=0;
        while(j<arr.length)
        {
            if(arr[j]!=0)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }

}