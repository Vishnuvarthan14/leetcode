class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col = mat[0].length;

        int arr[] = new int[row*col];

        if(row*col!=r*c)
            return mat;

        int k=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
                arr[k++]=mat[i][j];
        }
        int nmat[][] = new int[r][c];
        k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                nmat[i][j]=arr[k++];
        }
        return nmat;
    }
}