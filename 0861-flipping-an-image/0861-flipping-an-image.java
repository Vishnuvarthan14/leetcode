class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int arr[]:image)
        {
            int start=0;
            int end=arr.length-1;
            while(start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }

        for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image[0].length;j++)
            {
                image[i][j]=image[i][j]==1?0:1;
            }
        }

        return image;
    }
}