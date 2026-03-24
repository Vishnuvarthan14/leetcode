class Solution {
    public int orangesRotting(int[][] grid) {
        
        int minutes=0;
        int total_orange = 0;
        int rotten=0;

        Queue <int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                {
                    rotten++;
                    q.offer(new int[]{i,j});
                    total_orange++;
                }
                else if(grid[i][j]==1)
                total_orange++;
            }
        }
        // System.out.println(q);
        // System.out.println(total_orange);

        while(!q.isEmpty())
        {
            int size=q.size();
            boolean doRot=false;
            for(int i=0;i<size;i++)
            {
            int ind[]=q.remove();
            int row = ind[0];
            int col = ind[1];

            if(row-1!=-1&&grid[row-1][col]==1)
            {
                grid[row-1][col]=2;
                rotten++;
                q.offer(new int[]{row-1,col});
                doRot=true;
            }
            if(row+1!=grid.length&&grid[row+1][col]==1)
            {
                grid[row+1][col]=2;
                rotten++;
                q.offer(new int[]{row+1,col});
                doRot=true;
            }
            if(col-1!=-1&&grid[row][col-1]==1)
            {
                grid[row][col-1]=2;
                rotten++;
                q.offer(new int[]{row,col-1});
                doRot=true;
            }
            if(col+1!=grid[row].length&&grid[row][col+1]==1)
            {
                grid[row][col+1]=2;
                rotten++;
               q.offer(new int[]{row,col+1});
               doRot=true;
            }
            }

            if(doRot)
             minutes++;
        }
       
        return total_orange-rotten==0?minutes:-1;
    }
}