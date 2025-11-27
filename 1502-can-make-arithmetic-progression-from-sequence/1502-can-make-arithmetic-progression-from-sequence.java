class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]+dif!=arr[i+1])
                return false;
        }
        return true;
    }
}