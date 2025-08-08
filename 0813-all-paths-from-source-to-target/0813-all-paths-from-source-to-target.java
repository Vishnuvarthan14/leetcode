class Solution {
    List<List<Integer>> paths = new ArrayList<>();
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List <Integer> path = new ArrayList<>();
        DFS(0,graph.length-1,graph,path);
        return paths;
    }

    public void DFS(int source,int dest,int[][] graph,List<Integer> path)
    {
        path.add(source);
        if(source==dest)
        {
            paths.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }
        
        for(int i:graph[source])
        {  
            DFS(i,dest,graph,path);
        }

        path.remove(path.size()-1);
    }
}