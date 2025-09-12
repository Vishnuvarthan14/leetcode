class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int arr[] = new int[matrix.length * matrix[0].length];
        int ind=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                arr[ind++]=matrix[i][j];
            }
        }

        return binarySearch(arr,target);
    }
    public boolean binarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

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
}