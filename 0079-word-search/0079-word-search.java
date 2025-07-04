class Solution {
    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];
        int i=0;
        int j=0;
        for(i=0;i<board.length;i++)
        {
            for(j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0)&&wordExists(board,word,i,j,0,visited))
                     return true;
            }
        }
        return false;
    }

    public boolean wordExists(char board[][],String word,int x,int y,int ind,boolean visited[][])
    {
        if(x<0||x>=board.length||y<0||y>=board[0].length||board[x][y]!=word.charAt(ind)||visited[x][y])
            return false;

            if(ind==word.length()-1)
              return true;

        visited[x][y]=true;

      boolean found= wordExists(board,word,x+1,y,ind+1,visited)||
      wordExists(board,word,x,y-1,ind+1,visited)||
      wordExists(board,word,x,y+1,ind+1,visited)||
      wordExists(board,word,x-1,y,ind+1,visited);

      visited[x][y]=false;

      return found;
    }
}