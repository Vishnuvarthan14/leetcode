class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1'){
                count++;
                search(grid,i,j,grid.length,grid[i].length);
                }
            }
        }
        // for(char[] arr:grid)
        //     System.out.println(Arrays.toString(arr));
        return count;
    }

    public void search(char[][] grid,int i,int j,int n,int m)
    {
        if(i==-1||i==n||j==-1||j==m||grid[i][j]=='0')
        return;

        grid[i][j]='0';

        search(grid,i+1,j,n,m);
        search(grid,i-1,j,n,m);
        search(grid,i,j+1,n,m);
        search(grid,i,j-1,n,m);
        
    }
}