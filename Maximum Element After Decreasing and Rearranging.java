class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            int abs=arr[i]-arr[i+1];
            if(Math.abs(abs)>1)
            {
                arr[i+1]=arr[i]+1;
            }
        }
        Arrays.sort(arr);
        if(arr[0]!=1)
        return arr.length;
        else
        return arr[arr.length-1];
    }
}