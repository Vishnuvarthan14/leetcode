class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        int arr[] = new int[points.length];
        for(int i=0;i<points.length;i++)
            arr[i]=points[i][0];
        
        Arrays.sort(arr);
        int max=-1;
        for(int i=0;i<arr.length-1;i++)
            {
                int abs= Math.abs(arr[i]-arr[i+1]);
                if(abs>max)
                    max=abs;
            }
        return max;
    }
}