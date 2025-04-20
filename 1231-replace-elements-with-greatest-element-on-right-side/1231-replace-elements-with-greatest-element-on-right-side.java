class Solution {
    public int[] replaceElements(int[] arr) {
        int nums[] = new int[arr.length];
        int max=-1;

        for(int i=arr.length-1;i>=0;i--)
        {
            nums[i]=max;
            if(max<arr[i])
                max=arr[i];
        }

        return nums;
    }
}