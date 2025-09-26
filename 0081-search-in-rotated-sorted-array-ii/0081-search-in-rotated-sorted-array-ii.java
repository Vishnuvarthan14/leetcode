class Solution {
    public boolean search(int[] nums, int target) {
        if(nums.length==1)
        {
            if(nums[0]==target)
                return true;
            return false;
        }

        int ind=findPeek(nums);
        if(nums[ind]==target)
            return true;
        return bin(nums,target,0,ind-1)||bin(nums,target,ind+1,nums.length-1);
    }
    public boolean bin(int arr[],int target,int start,int end)
    {
       while(start<=end)
       {
        int mid=(start+end)/2;
        if(arr[mid]==target)
            return true;
        else if(arr[mid]>target)
            end=mid-1;
        else
            start=mid+1;
       }
       return false;
    }
    public int findPeek(int arr[])
    {
         int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end= mid;
            } else {
                if (end > 0 && arr[end] < arr[end - 1]) {
                    return end; 
                }
                end--; 
            }
        }
        return start;
    }
}