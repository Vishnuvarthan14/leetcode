class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;

        boolean visited[] = new boolean[isConnected.length];

        for(int i=0;i<isConnected.length;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(isConnected,visited,i);
            }
        }
        return count;
    }

    public void dfs(int [][] adj,boolean []visited,int start)
    {
        Stack <Integer> stack = new Stack<>();
        stack.push(start);

        while(!stack.isEmpty())
        {
            int val = stack.pop();

                for(int i=0;i<adj[val].length;i++)
                {
                    if(adj[val][i]==1&&!visited[i]){
                    stack.push(i);
                    visited[i]=true;
                    }
                }
            
        }
    }
}