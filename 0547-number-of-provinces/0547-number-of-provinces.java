class Solution {
    int parent[];
    int rank[];
    public void addEdges(int[][] edges)
    {
        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<edges[i].length;j++)
            {
                if(edges[i][j]==1)
               union(i,j);
            }
        }
    }

    public int findCircleNum(int[][] edges) {
        rank=new int[edges.length];
        parent=new int[edges.length];

        for(int i=0;i<edges.length;i++)
        {
            parent[i]=i;
        }
        int cmp=0;
        addEdges(edges);
        for(int i=0;i<edges.length;i++)
        {
            if(find(i)==i)
            cmp++;
        }
        //System.out.println(Arrays.toString(ds.rank));
        return cmp;
    }

    public int find(int x)
    {
        int root=parent[x];

        if(parent[root]!=root)
        {
           return parent[x]=find(root);
        }

        return root;
    }

    public void union(int x,int y)
    {
        int xRoot=find(x);
        int yRoot=find(y);

        if(xRoot==yRoot)
            return;
        if(rank[xRoot]>rank[yRoot])
        {
            parent[yRoot]=xRoot;
        }
        else if(rank[xRoot]<rank[yRoot])
        {
            parent[xRoot]=yRoot;
        }
        else
        {
            parent[yRoot]=xRoot;
            rank[xRoot]++;
        }
    }
}