class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue <int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[image.length][image[0].length];

        q.offer(new int[]{sr,sc});
        int val = image[sr][sc];
        image[sr][sc]=color;

        while(!q.isEmpty())
        {
             int ind[]=q.remove();
            int row = ind[0];
            int col = ind[1];

            if(row-1!=-1&&image[row-1][col]==val&&!visited[row-1][col])
            {
                image[row-1][col]=color;
                visited[row-1][col]=true;
                q.offer(new int[]{row-1,col});
            }
            if(row+1!=image.length&&image[row+1][col]==val&&!visited[row+1][col])
            {
                image[row+1][col]=color;
                visited[row+1][col]=true;
                q.offer(new int[]{row+1,col});
            }
            if(col-1!=-1&&image[row][col-1]==val&&!visited[row][col-1])
            {
                image[row][col-1]=color;
                visited[row][col-1]=true;
                q.offer(new int[]{row,col-1});
            }
            if(col+1!=image[row].length&&image[row][col+1]==val&&!visited[row][col+1])
            {
                image[row][col+1]=color;
                visited[row][col+1]=true;
               q.offer(new int[]{row,col+1});
            }
        }


        return image;
    }
}