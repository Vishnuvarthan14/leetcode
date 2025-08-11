class Solution {

    public void addEdges(int[][] edges,Disjoin ds)
    {
        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<edges[i].length;j++)
            {
                if(edges[i][j]==1)
               ds.union(i,j);
            }
        }
    }

    public int findCircleNum(int[][] edges) {
        Disjoin ds = new Disjoin(edges.length);
        int cmp=0;
        addEdges(edges,ds);
        for(int i=0;i<edges.length;i++)
        {
            if(ds.find(i)==i)
            cmp++;
        }
        //System.out.println(Arrays.toString(ds.rank));
        return cmp;
    }
}
class Disjoin
{
    int parent[];
    int rank[];
    Disjoin(int n)
    {
        rank=new int[n];
        parent=new int[n];

        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }
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