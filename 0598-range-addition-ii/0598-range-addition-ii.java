class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)
        return m*n;

        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        
        for(int arr[]:ops){
            min1=Math.min(min1,arr[0]);
            min2=Math.min(min2,arr[1]);
        }
        return min1*min2;
    }
}