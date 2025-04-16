class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        // int arr[]=new int[nums.length];
        // int k=0;
        // for(int i :nums)
        // {
        //     if(i%2==0)
        //         arr[k++]=i;
        // }
        // for(int i :nums)
        // {
        //     if(i%2!=0)
        //         arr[k++]=i;
        // }
        // return arr;
        int i=0,j=0;
        while(j<nums.length)
        {
            if(nums[j]%2==0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}