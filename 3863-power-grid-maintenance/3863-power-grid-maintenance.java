class Solution {
   private ArrayList <ArrayList<Integer>> adjs = new ArrayList<>();
   private HashMap <Integer,TreeSet<Integer>> map= new HashMap<>();

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
       
        int nodeMap[] = new int[c];
        for(int i=0;i<c;i++)
        {
            adjs.add(new ArrayList<>());
        }

        insert(connections);

        boolean visited[] = new boolean[c];
        int comp=1;
        for(int i=0;i<c;i++)
        {
            if(!visited[i]){
                map.put(comp,bfs(comp,i,visited,nodeMap));
                comp++;
                }
        }

          

         return compute(nodeMap,queries);
    }

    public int[] compute(int[] nodeMap,int[][] queries)
    {
         ArrayList <Integer> ans = new ArrayList<>();
          for(int arr[]:queries)
           {
            if(arr[0]==1)
            {
                int node=arr[1]-1;
                int cmp=nodeMap[node];
               if(map.get(cmp).isEmpty())
                ans.add(-1);
                else if(map.get(cmp).contains(node))
                ans.add(node+1);
                else
                ans.add(map.get(cmp).first()+1);
            }
            else if(arr[0]==2)
            {
               int node=arr[1]-1;
                int cmp=nodeMap[node];
               if(map.get(cmp).contains(node))
               {
                map.get(cmp).remove(node);
               }
            }
           }

           int arr[] = new int[ans.size()];
          for(int i=0;i<ans.size();i++)
          {
            arr[i]=ans.get(i);
          }
        return arr;
    }

    public TreeSet<Integer> bfs(int comp,int source,boolean visited[],int[] nodeMap)
    {
        Queue <Integer> q=new LinkedList<>();
        TreeSet <Integer> set = new TreeSet<>();

        q.add(source);
        nodeMap[source]=comp;
        visited[source]=true;

        while(!q.isEmpty())
        {
            int val = q.poll();
            visited[val]=true;
            set.add(val);
            for(int i:adjs.get(val))
            {
                if(!visited[i])
                {
                    q.add(i);
                    nodeMap[i]=comp;
                }
            }
        }
        return set;
    }

    public void insert(int[][] connections)
    {
        for(int arr[]:connections)
        {
            adjs.get(arr[0]-1).add(arr[1]-1);
            adjs.get(arr[1]-1).add(arr[0]-1);
        }
    }
}