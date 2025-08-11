class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        boolean[][]  visited= new boolean[grid.length][grid[0].length];

        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1&&!visited[i][j])
                {
                    int area=backtrack(grid,i,j,visited);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }

    public int backtrack(int[][] grid,int i,int j,boolean[][] visited)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||visited[i][j]||grid[i][j]==0)
            return 0;
        
        visited[i][j]=true;

      return 1+ backtrack(grid,i-1,j,visited) + backtrack(grid,i+1,j,visited) + backtrack(grid,i,j-1,visited) + backtrack(grid,i,j+1,visited);
    }
}