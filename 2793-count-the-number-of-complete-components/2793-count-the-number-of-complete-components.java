class Solution {
    ArrayList<ArrayList<Integer>> adjs;
    public int countCompleteComponents(int n, int[][] edges) {
        
        adjs=new ArrayList<>();
        for(int i=0;i<n;i++)
            adjs.add(new ArrayList<>());

            for(int i=0;i<edges.length;i++)
            {
                adjs.get(edges[i][0]).add(edges[i][1]);
                adjs.get(edges[i][1]).add(edges[i][0]);
            }
        boolean visited[] = new boolean[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                if(bfs(i,visited))
                count++;
            }
        }
        return count;
    }
    public boolean bfs(int start,boolean[] visited)
    {
        Queue <Integer> q = new LinkedList<>();
        q.add(start);
        int edges=0;
        int node=0;
        visited[start]=true;

        while(!q.isEmpty())
        {
            node++;
            int val = q.poll();
            for(int i:adjs.get(val))
            {
                edges++;
                if(!visited[i])
                {
                    visited[i]=true;
                    q.add(i);
                }
                
            }
        }
        edges/=2;
        return edges==node*(node-1)/2;
    }
}