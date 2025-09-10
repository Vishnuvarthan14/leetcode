class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum=0;
        int n=grid.length;
        int row_max[] = new int[n];
        int col_max[] = new int[n];

        for(int i=0;i<n;i++)
        {
            int max1=-1;
            int max2=-1;
            for(int j=0;j<n;j++)
            {
                if(max1<grid[i][j])
                    max1=grid[i][j];

                if(max2<grid[j][i])
                    max2=grid[j][i];
            }

            row_max[i]=max1;
            col_max[i]=max2;

        }
        // System.out.println(Arrays.toString(row_max));
        // System.out.println(Arrays.toString(col_max));

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int min=Math.min(row_max[i],col_max[j]);
                sum+=(min-grid[i][j]);
            }
        }
        return sum;
    }
}